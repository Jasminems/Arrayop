/*A Java program to check 2 elements in an array*/
import java.util.*; 
import java.io.*; 
class Specival 
{
	public static void main(String args[])
	{
	    int[] a={12, 12, 23, 23, 23, 12};
		System.out.println("Original Array: "+Arrays.toString(a)); 
		int n1 = 12;
	    int n2 = 23;
		System.out.println("Result: "+result(a, n1, n2));
	 }	
	 public static boolean result(int[] a, int n1, int n2)
	 {
	    for (int n : a)
	    {
	    	boolean r = n != n1 && n != n2;
	    	if (r) 
	    	{
	    		return false;
	    	}
	     }
	     return true;
	  }
}
