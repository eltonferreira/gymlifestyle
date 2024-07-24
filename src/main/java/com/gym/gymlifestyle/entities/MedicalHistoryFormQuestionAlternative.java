package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.entities.interfaces.GenericFormQuestionAlternative;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "medical_history_form_question_alternatives")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalHistoryFormQuestionAlternative implements GenericEntity<UUID>,
        GenericFormQuestionAlternative<MedicalHistoryFormQuestion> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "medical_history_form_question_alternative_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "medical_history_form_question_alternative_name", nullable = false)
    private String name;

    @Column(name = "medical_history_form_question_alternative_order", nullable = false)
    private int order;

    @ManyToOne
    @JoinColumn(name = "medical_history_form_question_id", nullable = false)
    private MedicalHistoryFormQuestion question;

}
