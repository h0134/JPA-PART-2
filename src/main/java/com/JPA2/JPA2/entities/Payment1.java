package com.JPA2.JPA2.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer Amount;

    public Payment1(Integer amount) {
        Amount = amount;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer getId() {
        return id;
    }

}
