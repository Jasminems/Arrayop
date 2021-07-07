/*A Java program to check specific value is present in array*/
import java.util.*;
class ArrSp 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println("The Given Array elements are:"+Arrays.toString(a));
		int value=3;
		boolean v=false;
		for(int n:a)
		{
			if(n==value) 
			{
				v=true;
				break;
			}
		}
		if(v)
			System.out.println(value+ " is present in an array");
		else
			System.out.println(value+ " is not present in an array");
	}
}
