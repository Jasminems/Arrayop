/*A Java program to find missing number in an array*/
import java.util.Scanner;
class Misnum
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n: ");
      int n = sc.nextInt();
      int a[] = new int[n];
      System.out.println("Enter the values: ");
      for(int i=0; i<=n-2; i++)
      {
         a[i] = sc.nextInt();
      }
      int num = (n*(n+1))/2;
      int num1 = 0;
      for(int i=0; i<=n-2; i++) {
         num1 = num1+a[i];
      }
      int mnum = num-num1;
      System.out.println("Missing number is: "+mnum);
   }
}