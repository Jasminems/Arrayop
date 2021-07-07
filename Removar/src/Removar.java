/*A Java program to remove specific element in an array*/
import java.util.Arrays;
class Removar 
{
    public static int[] rem(int[] a,int index)
    {
        if (a == null|| index < 0|| index >= a.length) 
        {
        	return a;
        }
        int[] b = new int[a.length - 1];
        for (int i = 0, k = 0; i < a.length; i++) 
        {
            if (i == index)
            {
                continue;
            }
            b[k++] = a[i];
        }
        return b;
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3, 4, 5,6,7,8,9 };
        System.out.println("Original Array:"+Arrays.toString(a));
        int index=3;
        System.out.println("Index to be removed: "+ index);
        a = rem(a, index);
        System.out.println("Resultant Array: "+Arrays.toString(a));
    }
}