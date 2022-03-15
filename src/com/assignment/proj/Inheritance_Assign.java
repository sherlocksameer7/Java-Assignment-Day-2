package com.assignment.proj;

import java.util.Scanner;

public class Inheritance_Assign extends Conditional_Operations {

    public static void main(String[] args) {

        Inheritance_Assign inhet = new Inheritance_Assign();
        Scanner input = new Scanner(System.in);

        int x, y, valueModulo, valueSalary, addValue;
        System.out.println("Enter 1st Value: ");
        x = input.nextInt();
        System.out.println("Enter 2nd Value: ");
        y = input.nextInt();
        valueModulo = inhet.Modulo(x, y);
        valueSalary = inhet.Salary(x, y);
        addValue = inhet.Adding(x, y);
        System.out.println("Modulo Operations "+valueModulo);
        System.out.println("Salary Adding "+valueSalary);
        System.out.println("Adding "+addValue);
    }
}
