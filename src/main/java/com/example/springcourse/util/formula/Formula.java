package com.example.springcourse.util.formula;

import com.example.springcourse.models.DataSimulation;
import java.util.ArrayList;
import static com.example.springcourse.Constants.MULTI_RATE_FACTOR;
import static com.example.springcourse.Constants.VALUE_IVA;

public class Formula {
    public static ArrayList<Month> generateSimulation(DataSimulation data){
        double annualRateWithIva = data.getAnnualRate()  + MULTI_RATE_FACTOR;
        double monthlyRateWithoutIva = data.getAnnualRate()/12;
        double  monthlyRateWitIva = annualRateWithIva/12;
        double monthlyPayment = calculatePMT(data.getCapitalValue(), monthlyRateWithoutIva, data.getTerm());

        ArrayList<Month> months = new ArrayList<>();
        double balance;
        double monthlyFee;
        double capital;
        double interest;
        double iva;

        for (int i=0; i< data.getTerm(); i++){
           if(i == 0){
               interest = data.getCapitalValue() * monthlyRateWithoutIva;
               iva = interest * VALUE_IVA;
               capital =  monthlyPayment - interest - iva;
               monthlyFee = capital + interest + iva;
               balance = data.getCapitalValue() - capital;
           } else{
               Month auxMonth = months.get(i-1);
               interest = auxMonth.getBalance() *  monthlyRateWithoutIva;
               iva = interest * VALUE_IVA;
               capital =  monthlyPayment - interest - iva;
               monthlyFee = capital + interest + iva;
               balance = auxMonth.getBalance() - capital;
           }
           Month month = new Month(balance,monthlyFee,capital,interest,iva);
           months.add(month);
        }
        return months;
    }

    public static double calculatePMT(double creditValue, double interest,double term){
        double monthlyPayment;
        double ax1 = (Math.pow(1+interest,term)) * interest;
        double aux2 = (Math.pow(1+interest,term)) - 1;

        monthlyPayment = creditValue + (ax1/aux2);

        return  monthlyPayment;
    }
}
