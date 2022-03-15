class Lovely   // Parent Class
{

    public void riding()  // Same Function Name ***
    {
        System.out.println("Lovely Love is Lovable");
    }
}

class Love extends Lovely   // Child Class that can be Inherited using Extends with Parent Class and Assessing !!!
{
    public void riding()   // Same Function Name ***
    {
        System.out.println("Love is Passion");
    }
}

public class Over_riding {   // Public Class Name is to be Implemented in Below of the given code !!!

    public static void main(String args[])
    {
        Lovely ob1 = new Lovely();
        Lovely ob2 = new Love();

        ob1.riding();
        ob2.riding();  // Call itself using the determination of the Object Name !!!

    }
}
