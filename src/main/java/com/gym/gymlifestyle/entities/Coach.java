package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "coaches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coach implements GenericEntity<UUID> {

    @Id
    @Column(name = "coach_id", nullable = false, unique = true)
    private UUID id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "coach_id", nullable = false, unique = true)
    private User user;

    @Column(name = "coach_certification", length = 100)
    private String certification;

}
