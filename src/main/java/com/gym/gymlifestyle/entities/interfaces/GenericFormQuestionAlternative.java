package com.gym.gymlifestyle.entities.interfaces;

public interface GenericFormQuestionAlternative<T extends GenericFormQuestion<? extends GenericForm>> {

    String getName();

    void setName(String name);

    int getOrder();

    void setOrder(int order);

    T getQuestion();

    void setQuestion(T question);

}
