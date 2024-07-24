package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements GenericEntity<UUID> {

    @Id
    @Column(name = "student_id", nullable = false, unique = true)
    private UUID id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "student_id", nullable = false, unique = true)
    private User user;

    @Column(name = "student_height", nullable = false)
    private Double height;

    @Column(name = "student_weight", nullable = false)
    private Double weight;

    @Column(name = "student_natural", nullable = false)
    private boolean natural;

    @ManyToOne
    @JoinColumn(name = "coach_id", nullable = false)
    private Coach coach;

}
