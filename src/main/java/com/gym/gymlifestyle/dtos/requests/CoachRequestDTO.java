package com.gym.gymlifestyle.dtos.requests;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoachRequestDTO {

    @Valid
    @NotNull
    private UserRequestDTO user;

    @Size(max = 100)
    private String certification;

}
