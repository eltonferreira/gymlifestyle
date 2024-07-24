package com.gym.gymlifestyle.entities.interfaces;

import com.gym.gymlifestyle.enums.QuestionType;

public interface GenericFormQuestion<T extends GenericForm> {

    String getName();

    void setName(String name);

    QuestionType getType();

    void setType(QuestionType type);

    int getOrder();

    void setOrder(int order);

    T getForm();

    void setForm(T form);

}
