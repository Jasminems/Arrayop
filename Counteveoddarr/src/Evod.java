/*A Java program to find number of even and odd numbers in an array*/
import java.util.Scanner;
class Evod 
{
	public static void main(String[] args) 
	{
		int n, i;
		int evenc = 0, oddc = 0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		n = s.nextInt();	
		int [] a = new int[n];
		System.out.print("Enter the Values: ");
		for (i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}   

		for(i = 0; i < n; i++)
		{
			if(a[i] % 2 == 0)
			{
				evenc++;
			}
			else
			{
				oddc++;
			}
		}		
		System.out.println("Total Number of Even Numbers:" + evenc);
		System.out.println("Total Number of Odd  Numbers:" + oddc);
	}
}