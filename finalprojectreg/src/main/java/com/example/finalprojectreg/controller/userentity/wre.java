package com.example.finalprojectreg.controller.userentity;

import java.io.FileWriter;
import java.util.Scanner;

public class wre {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        double principal, rate, time, emi;

        System.out.print("Enter loan amount: ");
        principal = a.nextFloat();

        System.out.print("Enter rate: ");
        rate = a.nextFloat();

        System.out.print("Enter emi period in years: ");
        time = a.nextFloat();

        rate = rate / (12 * 100);
        double pt;
        pt = time;
        time = time * 12;


        emi = Math.round((principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1));

        System.out.print("Monthly EMI is= " + emi + "\n");
        double amount;
        amount = emi * time;
        double t;
        t = amount;
        long t1 = (long) t;
        for (int i = 1; i <= time; i++) {
            amount = amount - emi;
            // emi=Math.round(emi);
            System.out.println(i + "th month the emi is " + emi + " remaining balance is " + amount);
        }
        try {
            rate = rate * (12 * 100);
            FileWriter writer = new FileWriter("C:/Users/S S REDDY/Downloads/runee.txt");
            writer.append("**********LOAN CALCULATION********\n");
            writer.append("===================================\n");
            writer.append("          LOAN AMOUNT::" + principal);
            writer.append("\n        TIME(months)::" + time);
            // time=time/12;
            writer.append("\n        Time(years)::" + pt);
            writer.append("\n        RATE OF INTEREST::" + rate);
            writer.append("\n        MONTHLY EMI::" + emi + "\n");
            amount = emi * time;
            for (int i = 0; i < time; i++) {
                amount = amount - emi;
                writer.append("\n" + i + "th month the emi is " + emi + " remaining balance is " + amount);
            }
            writer.append("\n===========================================");
            writer.append("\n      Enter Total amount Paid:" + t1);
            writer.append("\n Loan Amount:" + principal + "     Excessed Interest Amount" + (t - principal));
            writer.append("\n===========================================");
            writer.append("\n     **********LOAN CLOSED**********\n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done");

    }
}
