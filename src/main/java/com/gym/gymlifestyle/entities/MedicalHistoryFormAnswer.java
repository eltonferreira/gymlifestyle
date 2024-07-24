package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.entities.interfaces.GenericFormAnswer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "medical_history_form_answers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalHistoryFormAnswer implements GenericEntity<UUID>, GenericFormAnswer<MedicalHistoryFormQuestion> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "medical_history_form_answer_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "medical_history_form_answer_description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "medical_history_form_question_id", nullable = false)
    private MedicalHistoryFormQuestion question;

    @ManyToOne
    @JoinColumn(name = "medical_history_id", nullable = false)
    private MedicalHistory medicalHistory;

}
