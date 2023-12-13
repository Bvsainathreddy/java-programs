import java.util.Scanner;
public class multiplicationtable
{
   public static void main(String args[])
   {
      Scanner reader = new Scanner(System.in);
      System.out.print("\n enter the number for multiplication table:");
      int num = reader.nextInt();
      System.out.print("\n table is = ");
      for(int i=0;i<=10;i++)
      {
         System.out.print(num+"*"+i+"="+num*i+"\n");
      }
   }
}