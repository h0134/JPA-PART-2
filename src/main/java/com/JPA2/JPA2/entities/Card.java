package com.JPA2.JPA2.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class Card extends Payment{

    private Integer cardno;

    public Card(Integer amount, Integer cardno) {
        super(amount);
        this.cardno = cardno;
    }

    public Integer getCardno() {
        return cardno;
    }

    public void setCardno(Integer cardno) {
        this.cardno = cardno;
    }
}