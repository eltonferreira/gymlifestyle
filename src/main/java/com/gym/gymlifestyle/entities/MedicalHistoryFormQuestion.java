package com.gym.gymlifestyle.entities;

import com.gym.gymlifestyle.entities.interfaces.GenericEntity;
import com.gym.gymlifestyle.entities.interfaces.GenericFormQuestion;
import com.gym.gymlifestyle.enums.QuestionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "medical_history_form_questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalHistoryFormQuestion implements GenericEntity<UUID>, GenericFormQuestion<MedicalHistoryForm> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "medical_history_form_question_id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "medical_history_form_question_name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "medical_history_form_question_type", nullable = false)
    private QuestionType type;

    @Column(name = "medical_history_form_question_order", nullable = false)
    private int order;

    @ManyToOne
    @JoinColumn(name = "medical_history_form_id", nullable = false)
    private MedicalHistoryForm form;

}
