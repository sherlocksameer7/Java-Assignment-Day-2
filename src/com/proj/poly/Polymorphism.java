package com.proj.poly;

public class Polymorphism {

    public int Addnumbers(int a, int b)
    {
        int sum =  a+b;
        return sum;
    }

    public int Addnumbers(int a, int b, int c)
    {
        int sum = a+b+c;
        return sum;
    }

    public static void main(String[] args)
    {

        Polymorphism p_obj = new Polymorphism();

        int poly1 = p_obj.Addnumbers(21, 14);
        int poly2 = p_obj.Addnumbers(21, 14, 7);
        System.out.println("This is for 1st Value Parameter: "+poly1);
        System.out.println("This is for 2nd Value of given Parameter: "+poly2);


    }
}

// This is Called METHOD-OVERLOADING Concept !!!