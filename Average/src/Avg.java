/*A Java program to calculate the average of an array*/
import java.util.Scanner;
class Avg 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the value of n:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/n;
		System.out.println("Sum="+sum);
		System.out.println("Average:"+avg);
	}
}

