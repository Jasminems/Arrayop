/*A Java program to find duplicate values in an array*/
class Duplarr 
{
	public static void main(String[] args) 
	{
		System.out.println("The Given Array elements are:");
		int [] a = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < a.length; i++) 
        {  
        	for(int j = i + 1; j < a.length; j++) 
        	{  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        }  
        
	}
}
