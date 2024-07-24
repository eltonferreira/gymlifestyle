package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "medical_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalHistory implements GenericEntity<UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "medical_history_id", nullable = false, unique = true)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "medical_history_form_id", nullable = false)
    private MedicalHistoryForm medicalHistoryForm;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

}
