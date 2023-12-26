import java.util.Scanner;

public class allprime
{
	public static void main(String args[])
	{
		Scanner reader =  new Scanner(System.in);
		System.out.print("\nEnter the Start Number: ");
		int startNum = reader.nextInt();
		System.out.print("\nEnter the End Number: ");
		int endNum = reader.nextInt();
		int primeCount = 0;
		for (int i = startNum; i <= endNum; i++)
		{
			boolean test = false;
			for (int j = 2; j <i; j++)
			{
				if (i % j == 0)
				{
					test = true;
					break;
				}
			}
			if (test == false)
			{
				System.out.print("\nPrime number = " + i);
				primeCount++;
			}
		}
		System.out.print("\nTotal number of primes are " + primeCount);
	}
}
\\Enter the Start Number: 5

\\Enter the End Number: 90

\\Prime number = 5
\\Prime number = 7
\\Prime number = 11
\\Prime number = 13
\\Prime number = 17
\\Prime number = 19
\\Prime number = 23
\\Prime number = 29
\\Prime number = 31
\\Prime number = 37
\\Prime number = 41
\\Prime number = 43
\\Prime number = 47
\\Prime number = 53
\\Prime number = 59
\\Prime number = 61
\\Prime number = 67
\\Prime number = 71
\\Prime number = 73
\\Prime number = 79
\\Prime number = 83
\\Prime number = 89
\\Total number of primes are 22
