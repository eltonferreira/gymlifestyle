package com.gym.gymlifestyle.dtos.requests;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {

    @NotNull
    @NotBlank
    @Size(max = 150)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Email
    private String email;

    @NotNull
    @NotBlank
    @Size(min = 11, max = 11)
    private String phone;

    private String password;

    @NotNull
    @NotBlank
    @CPF
    private String cpf;

    @NotNull
    private LocalDate birthdayDate;

    @NotNull
    @NotEmpty
    private List<UUID> roles;

    @NotNull
    private boolean active;

}
