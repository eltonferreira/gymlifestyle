package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.enums.WorkoutType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "workouts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workout implements GenericEntity<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "workout_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "workout_name", nullable = false, length = 100)
    private String name;

    @Column(name = "workout_description", nullable = false, length = 300)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "workout_type", nullable = false, length = 1)
    private WorkoutType type;

    @ManyToOne
    @JoinColumn(name = "workout_plan_id", nullable = false)
    private WorkoutPlan workoutPlan;

    @OneToMany(mappedBy = "workout")
    private List<WorkoutExercise> workoutExercises;

}
