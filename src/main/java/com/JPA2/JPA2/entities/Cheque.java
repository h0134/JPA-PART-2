package com.JPA2.JPA2.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Cheque extends Payment{

    private Integer chequeno;

    public Cheque(Integer amount, Integer chequeno) {
        super(amount);
        this.chequeno = chequeno;
    }

    public Integer getChequeno() {
        return chequeno;
    }

    public void setChequeno(Integer chequeno) {
        this.chequeno = chequeno;
    }
}
