import java.util.Scanner;

public class alphabetcharacter
{
    public static void main(String args[])
    {
       Scanner reader = new Scanner(System.in);
       System.out.print("\nPlease enter a characher: ");
       char ch = reader.next().charAt(0);
       if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
	{
	     System.out.print("\nEntred character is an Alphabet.");
	}
       else
       {
             System.out.print("\nEntered character is not an Alphabet.");
       }
    }
}
\\Please enter a characher: g

\\Entred character is an Alphabet.
