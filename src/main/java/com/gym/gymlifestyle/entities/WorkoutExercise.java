package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "workout_exercises")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutExercise implements GenericEntity<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "workout_exercise_id", nullable = false, unique = true)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;

    @Column(name = "workout_exercise_description", length = 300)
    private String description;

    @Column(name = "workout_exercise_series", nullable = false)
    private int series;

    @Column(name = "workout_exercise_repetitions", nullable = false)
    private int repetitions;

}
