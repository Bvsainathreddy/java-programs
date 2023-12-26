import java.util.Scanner;
public class reverseorder
{
   public static void main(String args[])
	{
	  Scanner reader = new Scanner (System.in);
	  System.out.print("\nEnter the number: ");
	  int num = reader.nextInt();
	  int numcopy = num;
	  int reversenum = 0;
	  while(num >0)
	  {
	    reversenum = reversenum*10 + num%10;
	    num = num/10;
	    System.out.print(num);
	  }	
	     System.out.print("\nReverse of the givne number is " + reversenum); 
	}
}
\\Enter the number: 5678
\\5675650
\\Reverse of the givne number is 8765
