package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // principal question

        Scanner scaner = new Scanner(System.in);
        byte turningInToNumber = 100;
        byte monthsPerYear = 12;
        int principal;
        while (true){
            System.out.print("Prinicpal (1K€ - 1M€):");                                                       //P
            principal = scaner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1 000 and 1 000 000.");
        }

        double monthlyInterest;
        double annualInterest;
        while(true){
            // annual interest rate question
            System.out.print("annual interest rate (1 - 30):");
            annualInterest = scaner.nextDouble();
            if (annualInterest > 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / turningInToNumber / monthsPerYear;     //r
                break;
            }
            System.out.println("Enter value greater than 1 and less or equal than 30.");
        }

        byte years;
        int numberOfPayments;
        while(true) {
            // period (years)
            System.out.print("period (years):");
            years = scaner.nextByte();                                                       //n
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * monthsPerYear;
                break;
            }
            System.out.println("enter value between 1 and 30.");
        }
        // finial result
        double z = 1 + monthlyInterest;                    // z= r*(1+r)
        double zz = Math.pow(z, numberOfPayments);        // zz= r*(1+r)ˇn
        int mortage = (int)(principal* ((monthlyInterest * zz) / (zz-1)));

        double mortageT = principal * (monthlyInterest*Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);



        String mortageFormated = NumberFormat.getCurrencyInstance().format(mortageT);
        System.out.println("Mortgage:" + mortageFormated);
    }
}











package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unitSystemInput;
        String convertingBetween;
        boolean firstStringAnswer;


        //System.out.println(unitSystemInput);


        while (true) {
            System.out.print("From wich unit system you want to convert?:");
            // First String input
            unitSystemInput = scanner.nextLine().toLowerCase().trim();

            if ((unitSystemInput.equals("metric")) || (unitSystemInput.equals("imperial"))) {
                System.out.println(unitSystemInput);
                break;
            }
            System.out.println("Invalid input! Enter value again. Write Metric or Imperial.:");
        }

        //if (unitSystemInput.equals("metric"))
        //  System.out.print("Do you want to convert to metric values or imperial unit system?:");
        //else if (unitSystemInput.equals("imperial"))
        //System.out.print("Do you want to convert to imperial values or metric unit system?:");


        //System.out.print("Do you want to convert to metric values or imperial unit system?:");
        //convertingBetween = scanner.nextLine().toLowerCase().trim();

        while (true) {
            if (unitSystemInput.equals("metric")) {
                System.out.print("Do you want to convert to metric values or imperial unit system?:");
                convertingBetween = scanner.nextLine().toLowerCase().trim();
                if (convertingBetween.equals("metric values")) {
                    System.out.println("write down your values");
                    break;
                }
            }else if (unitSystemInput.equals("imperial")){
                System.out.print("Do you want to convert to imperial values or metric unit system?:");
                convertingBetween = scanner.nextLine().toLowerCase().trim();
                if (convertingBetween.equals("imperial values")) {
                    System.out.println("write down your values second part of code");
                    break;
                }

            }System.out.println("Invalid input! Enter value again.:");
        }


    }
}
