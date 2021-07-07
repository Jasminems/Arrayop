/*A Java program to insert an element at a specific position*/
import java.util.Scanner;
class Insp 
{
    public static void main(String[] args) 
    {
        int n, p, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        p = s.nextInt();
        System.out.print("Enter the element to insert:");
        x = s.nextInt();
        for(int i = (n-1); i >= (p-1); i--)
        {
            a[i+1] = a[i];
        }
        a[p-1] = x;
        System.out.print("After inserting,the New Array is:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}