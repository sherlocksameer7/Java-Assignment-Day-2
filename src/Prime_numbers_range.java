import java.util.Scanner;

public class Prime_numbers_range
{

    public static void main(String[] args)
    {

        int i = 0, fNum, sNum, temp, temp1 = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        fNum = sc.nextInt();

        System.out.println("Enter 2nd Number");
        sNum = sc.nextInt();

        System.out.println("Range between the Prime Numbers are " + fNum + " and " + sNum + " are");

        while (fNum <= sNum)
        {
            temp = 0;
            for (i = 2; i <= (fNum / 2); i++)
            {
                if (fNum % i == 0)
                {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0)
            {
                System.out.println(fNum);
            }

            fNum++;
        }
    }
}
