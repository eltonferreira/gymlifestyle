package com.gym.gymlifestyle.dtos.requests;

import com.gym.gymlifestyle.enums.Muscle;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseRequestDTO {

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 300)
    private String description;

    @NotNull
    private Muscle muscle;

    @NotNull
    private boolean machine;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String urlVideo;

}
