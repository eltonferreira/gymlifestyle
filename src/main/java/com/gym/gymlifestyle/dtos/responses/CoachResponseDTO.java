package com.gym.gymlifestyle.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoachResponseDTO {

    private UUID id;
    private UserResponseDTO user;
    private String certification;

}
