package com.gym.gymlifestyle.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutPlanRequestDTO {

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String name;

    @NotNull
    @NotEmpty
    private List<UUID> workouts;

    @NotNull
    private UUID coach;

    @NotNull
    private UUID student;

    @NotNull
    private LocalDate initialDate;

    @NotNull
    private LocalDate finalDate;

    @NotNull
    private boolean active;

}
