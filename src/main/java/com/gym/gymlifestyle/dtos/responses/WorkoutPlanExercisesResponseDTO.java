package com.gym.gymlifestyle.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutPlanExercisesResponseDTO {

    private UUID id;
    private WorkoutPlanResponseDTO workoutPlan;
    private ExerciseResponseDTO exercise;
    private String description;
    private int series;
    private int repetitions;

}
