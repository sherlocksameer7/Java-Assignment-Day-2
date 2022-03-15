package com.project.assignment;

import java.util.Scanner;

public class CLASS_operations {

    public static void main(String[] args) {

        // Object Creation ***

        Addition add_obj = new Addition();
        Multiplication mul_obj = new Multiplication();
        Divisible_by_8 div_obj = new Divisible_by_8();

        Integer x,y,m,Addition_result,Multiplication_result,Divisible_result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Num: ");
        x = input.nextInt();

        System.out.println("Enter 2nd Num: ");
        y = input.nextInt();

        System.out.println("Enter a Number Which is Divisible by 8 or Not: ");
        m = input.nextInt();

        Addition_result = add_obj.Add_two_numbers(x, y);
        System.out.println("Addition of Two Numbers "+Addition_result);

        Multiplication_result = mul_obj.Mul_two_numbers(x, y);
        System.out.println("Multiplication of Two Numbers "+Multiplication_result);

        Divisible_result = div_obj.div_by_8(m);
        System.out.println("Divisible by 8 or NOT\n"+Divisible_result);
    }
}
