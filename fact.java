import java.util.Scanner;
public class fact
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("\n enter the number");
        int n = reader.nextInt();
        int fact = 1;
        if(n==0)
        {
            System.out.print("\n the factorial of a number is n");
        }
        else if(n>0)
        {
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.print("\n factorial of given number is:"+ fact);
        }
        else
        {
            System.out.print("\n  the number is invalid");
        }
    }
}
             
        