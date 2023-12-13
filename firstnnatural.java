import java.util.Scanner;
public class firstnnatural
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the total numbers:\n");
	   int num = reader.nextInt();
	   System.out.println("First n natural numbers are:\n");
	   for (int i = 1; i <= num; i++)
	   {
	     	System.out.print(i"\n");
	   }
    }
}