package com.gym.gymlifestyle.dtos.requests;

import com.gym.gymlifestyle.enums.RoleName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleRequestDTO {

    @NotNull
    private RoleName name;

}
