package com.example.springcourse.models;

import javax.persistence.*;
import javax.validation.constraints.Min;

import static com.example.springcourse.Constants.*;

@Entity
public class DataSimulation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Min(value = MINIMUM_TERM)
    @Column(name = COLUMN_TERM)
    private int term;

    @Min(value = (long) MINIMUM_CREDIT_VALUE)
    @Column(name = COLUMN_CAPITAL_VALUE)
    private double capitalValue;

    @Column(name = COLUMN_ANNUAL_RATE)
    private double annualRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getCapitalValue() {
        return capitalValue;
    }

    public void setCapitalValue(double capitalValue) {
        this.capitalValue = capitalValue;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }
}
