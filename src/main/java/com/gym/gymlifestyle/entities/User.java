package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements GenericEntity<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "user_name", nullable = false, length = 150)
    private String name;

    @Column(name = "user_email", nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "user_phone", nullable = false, length = 11)
    private String phone;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "user_cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "user_birthday_date", nullable = false)
    private LocalDate birthdayDate;

    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false))
    private List<Role> roles;

    @Column(name = "user_active", nullable = false)
    private boolean active;

}
