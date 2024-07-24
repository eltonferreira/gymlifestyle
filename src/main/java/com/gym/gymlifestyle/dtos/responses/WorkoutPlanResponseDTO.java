package com.gym.gymlifestyle.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutPlanResponseDTO {

    private UUID id;
    private String name;
    private List<WorkoutPlanExercisesResponseDTO> workoutPlanExercises;
    private CoachResponseDTO trainer;
    private StudentResponseDTO student;
    private LocalDate initialDate;
    private LocalDate finalDate;
    private boolean active;

}
