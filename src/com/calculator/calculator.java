package com.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter your numbers please");
        System.out.println("Number 1: ");

        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Number 1: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Sum: "+ sum(num1, num2));
        System.out.println("Rest: "+ rest(num1, num2));
    }

    public static double sum(double num1, double num2)
    {
        return num1 + num2;
    }

    public static double rest(double num1, double num2)
    {
        return  num1 - num2;
    }
}
