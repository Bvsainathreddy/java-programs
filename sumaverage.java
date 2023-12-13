import java.util.Scanner;
public class sumaverage
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("\n enter the first number:");
        int a = reader.nextInt();
        System.out.print("\n enter the second number:");
        int b = reader.nextInt();
        System.out.print("\n enter the third number:");
        int c = reader.nextInt();
        System.out.print("\n enter the fourth number:");
        int d = reader.nextInt();
        System.out.print("\n enter the fifth number:");
        int e = reader.nextInt();
        int sum = a+b+c+d+e;
        System.out.print("\n sum="+sum);
        float avg = (a+b+c+d+e)/5;
        System.out.print("\n average = "+avg);
    }
}