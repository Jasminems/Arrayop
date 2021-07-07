/*A Java program to remove duplicate elements from an array*/
class Remdup
{  
	public static int rem(int a[], int n)
	{  
		if (n==0 || n==1)
		{  
			return n;  
		}  
    int[] temp = new int[n];  
    int j = 0;  
    for (int i=0; i<n-1; i++)
    {  
    	if (a[i] != a[i+1])
    	{  
    		temp[j++] = a[i];  
        }  
     }  
    temp[j++] = a[n-1];       
    for (int i=0; i<j; i++)
    {  
    	a[i] = temp[i];  
    }  
    return j;  
	}  
	public static void main (String[] args)
	{  
		System.out.println("The given Array is:");
		int a[] = {10,20,20,30,30,40,50,50};  
        int length = a.length;  
        for(int i=0;i<length;i++)
        System.out.println(a[i]+" ");
        length = rem(a, length);  
        System.out.println("The New Array is:");
        for (int i=0; i<length; i++)  
           System.out.print(a[i]+" ");  
    }  
}