package com.JPA2.JPA2.embeddedmapping;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmployeeSalary {


    private Integer basicsalary;

    private Integer bonussalary;

    private Integer taxamount;

    private Integer specialallowancesalary;

    public EmployeeSalary(Integer basicsalary, Integer bonussalary, Integer taxamount, Integer specialallowancesalary) {
        this.basicsalary = basicsalary;
        this.bonussalary = bonussalary;
        this.taxamount = taxamount;
        this.specialallowancesalary = specialallowancesalary;
    }

    public Integer getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Integer basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Integer getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(Integer bonussalary) {
        this.bonussalary = bonussalary;
    }

    public Integer getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Integer taxamount) {
        this.taxamount = taxamount;
    }

    public Integer getSpecialallowancesalary() {
        return specialallowancesalary;
    }

    public void setSpecialallowancesalary(Integer specialallowancesalary) {
        this.specialallowancesalary = specialallowancesalary;
    }
}
