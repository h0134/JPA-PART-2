package com.JPA2.JPA2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class Cheque1 extends Payment1{

    private Integer chequeno;

    public Cheque1(Integer amount, Integer chequeno) {
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
