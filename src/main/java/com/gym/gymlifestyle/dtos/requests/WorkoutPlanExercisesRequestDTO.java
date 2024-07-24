package com.gym.gymlifestyle.dtos.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutPlanExercisesRequestDTO {

    private UUID id;

    @NotNull
    private WorkoutPlanRequestDTO workoutPlan;

    @NotNull
    private ExerciseRequestDTO exercise;

    @NotNull
    @NotBlank
    @Size(max = 200)
    private String description;

    @NotNull
    @Min(1)
    private int series;

    @NotNull
    @Min(1)
    private int repetitions;

}
