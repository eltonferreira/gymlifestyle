package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.enums.Muscle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "exercises")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercise implements GenericEntity<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "exercise_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "exercise_name", nullable = false, length = 100)
    private String name;

    @Column(name = "exercise_description", nullable = false, length = 300)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "exercise_muscle", nullable = false, length = 100)
    private Muscle muscle;

    @Column(name = "exercise_machine", nullable = false)
    private boolean machine;

    @Column(name = "exercise_path_video", nullable = false, length = 100)
    private String pathVideo;

}
