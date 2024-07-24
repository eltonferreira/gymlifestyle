package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "physical_assessments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalAssessment implements GenericEntity<UUID> {

    @Id
    @Column(name = "physical_assessment_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "physical_assessment_weight", nullable = false)
    private Float weight;

    @Column(name = "physical_assessment_path_photo_front", nullable = false, unique = true)
    private String pathPhotoFront;

    @Column(name = "physical_assessment_path_photo_back", nullable = false, unique = true)
    private String pathPhotoBack;

    @Column(name = "physical_assessment_path_photo_left", nullable = false, unique = true)
    private String pathPhotoLeft;

    @Column(name = "physical_assessment_path_photo_right", nullable = false, unique = true)
    private String pathPhotoRight;

    @Column(name = "physical_assessment_considerations", length = 400)
    private String considerations;

    @Enumerated(EnumType.STRING)
    @Column(name = "physical_assessment_status", nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

}
