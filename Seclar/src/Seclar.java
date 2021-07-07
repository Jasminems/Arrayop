/*A Java program to find 2nd largest number in an array*/
class Seclar
{  
	public static int sec(int[] a, int total)
	{  
		int temp;  
		for (int i = 0; i < total; i++)   
		{  
			for (int j = i + 1; j < total; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
		return a[total-2];  
	}  
	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,2,10,15,11,12};   
		System.out.println("Second Largest: "+sec(a,10));  
	}  
}