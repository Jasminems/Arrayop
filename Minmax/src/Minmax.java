/*A Java program to find minimum and maximum value in an array*/
class Minmax 
{ 
	public static void main(String args[])
	{
		int a[] = new int[]{10, 11, 88, 2, 12, 120};
		int max = Max(a);
		System.out.println("Maximum Value is: "+max);
		int min = Min(a);
		System.out.println("Minimum Value is: "+min);
	}
	public static int Max(int[] inputArray)
	{ 
		int maxValue = inputArray[0]; 
		for(int i=1;i < inputArray.length;i++)
		{ 
			if(inputArray[i] > maxValue)
			{ 
				maxValue = inputArray[i]; 
			} 
		} 
		return maxValue; 
	}
	public static int Min(int[] inputArray)
	{ 
		int minValue = inputArray[0]; 
		for(int i=1;i<inputArray.length;i++)
		{ 
			if(inputArray[i] < minValue)
			{ 
				minValue = inputArray[i]; 
			} 
		} 
		return minValue; 
	} 
}