package com.gym.gymlifestyle.dtos.requests;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDTO {

    @Valid
    @NotNull
    private UserRequestDTO user;

    @NotNull
    @Min(1)
    private Double height;

    @NotNull
    @Min(1)
    private Double weight;

    @NotNull
    private boolean natural;

    @NotNull
    @NotBlank
    @Size(max = 300)
    private String patientHistory;

    @NotNull
    private UUID coach;

}
