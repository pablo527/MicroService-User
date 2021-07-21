package com.example.springcourse.util.formula;

public class Month {

    private double balance;
    private double monthlyFee;
    private double capital;
    private double interest;
    private double iva;

    public Month(double balance, double monthlyFee, double capital, double interest, double iva) {
        this.balance = balance;
        this.monthlyFee = monthlyFee;
        this.capital = capital;
        this.interest = interest;
        this.iva = iva;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


}
