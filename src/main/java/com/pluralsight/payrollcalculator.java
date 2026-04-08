package com.pluralsight;
import java.util.Scanner;


public class payrollcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        scanner.nextLine();

        System.out.println("Enter how many hours worked:");
        float hoursWorked = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter your pay rate: ");
        float payRate = scanner.nextFloat();
        scanner.nextLine();

        float grossPay = hoursWorked * payRate;

        System.out.printf(name +", your gross pay is $%2f", grossPay);


    }
}
