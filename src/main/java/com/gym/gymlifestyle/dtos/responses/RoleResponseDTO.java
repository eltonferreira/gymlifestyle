package com.gym.gymlifestyle.dtos.responses;

import com.gym.gymlifestyle.enums.RoleName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponseDTO {

    private UUID id;
    private RoleName name;

}
