package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.entities.interfaces.GenericForm;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "medical_history_forms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalHistoryForm implements GenericEntity<UUID>, GenericForm {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "medical_history_form_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "medical_history_form_name", nullable = false)
    private String name;

    @Column(name = "medical_history_form_description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "coach_id", nullable = false)
    private Coach coach;

}
