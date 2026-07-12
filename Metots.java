import java.util.Scanner;

public class Metots
{
    public static void main(String[] args)
    {
        printStar(5);
        printStar2(5);
    }

    static void printStar(int a)
    {
        for(int i = 1; i <= a; i++)
        {
            for(int j = 0; j <= (a - i); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void printStar2(int b)
    {
        for (int k = 1; k <= b; k++)
        {
            for (int l = 1; l <= k; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}