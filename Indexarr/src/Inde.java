/*A Java program to find an index of an array element*/
import java.util.Scanner;
class Inde
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
		int index=0;
		System.out.println("Enter the value to find an index:");
		int ele;
		ele=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				index=i;
				break;
			}
			
		}
		System.out.println(index);
	}
}