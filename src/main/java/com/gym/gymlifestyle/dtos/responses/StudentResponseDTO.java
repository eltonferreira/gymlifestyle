package com.gym.gymlifestyle.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDTO {

    private UUID id;
    private UserResponseDTO user;
    private Double height;
    private Double weight;
    private boolean natural;
    private String anamnesis;
    private CoachResponseDTO trainer;

}
