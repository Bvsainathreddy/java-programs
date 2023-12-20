import java.util.Scanner;
public class pattern
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("\n enter the number of patterns");
        int n = reader.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
//output
// enter the number of patterns5
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
      
