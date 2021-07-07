/*A Java program to difference between large and small number*/
import java.util.Arrays; 
class Difflarsm 
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5,6};
		System.out.println("Original Array: "+Arrays.toString(a)); 
		int max_val = a[0];
		int min = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max_val)
				max_val = a[i];
			else if(a[i] < min)
				min = a[i];
		}
		System.out.println("Difference between the largest and smallest value of the said array: "+(max_val-min));	
	}
}