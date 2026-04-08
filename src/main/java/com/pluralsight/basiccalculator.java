package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float numOne = scanner.nextFloat();

        System.out.println("Enter another number: ");
        float numTwo = scanner.nextFloat();

        float total = numOne + numTwo;

        System.out.printf("Total is:  %2f", total);




    }
}
