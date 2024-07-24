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
public class UserResponseDTO {

    private UUID id;
    private String name;
    private String email;
    private String phone;
    private String cpf;
    private LocalDate dateOfBirthday;
    private List<RoleResponseDTO> roles;
    private boolean active;

}
