package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "workout_plans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutPlan implements GenericEntity<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "workout_plan_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "workout_plan_name", nullable = false, length = 100)
    private String name;

    @ManyToOne
    @JoinColumn(name = "coach_id", nullable = false)
    private Coach coach;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @Column(name = "workout_plan_initial_date", nullable = false)
    private LocalDate initialDate;

    @Column(name = "workout_plan_final_date", nullable = false)
    private LocalDate finalDate;

    @Column(name = "workout_plan_active")
    private boolean active;

    @OneToMany(mappedBy = "workoutPlan")
    private List<Workout> workouts;

}
