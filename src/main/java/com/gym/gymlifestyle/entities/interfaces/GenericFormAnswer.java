package com.gym.gymlifestyle.entities.interfaces;

public interface GenericFormAnswer<T extends GenericFormQuestion<? extends GenericForm>> {

    String getDescription();

    void setDescription(String description);

    T getQuestion();

    void setQuestion(T question);

}
