import java.util.Scanner;
public class positiveornegative
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.printf("\n enter the  number");
        int num = reader.nextInt();
        if(num>0)
        {
            System.out.print("\n number is positive");
        }
        else if(num<0)
        {
            System.out.print("\n number is negative");
        }
        else
        {
            System.out.print("\n number is zero");
        }
    }
}
