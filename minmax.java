package DSAFUNDAMENTALS;
import java.util.Arrays;
import java.util.Scanner;
public class minmax {
	public static int findMinRec(int A[], int n)
	{
	    
	    if (n == 1)
	        return A[0];
	    return Math.min(A[n-1], findMinRec(A, n-1));
	}
	public static int findMaxRec(int A[], int n)
    {
      
      if(n == 1)
        return A[0];
         
        return Math.max(A[n-1], findMaxRec(A, n-1));
    }
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println(findMaxRec(A, n));
        System.out.println(findMinRec(A,n));
    }
}

	


