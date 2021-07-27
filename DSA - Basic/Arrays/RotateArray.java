https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0/
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t > 0)
	 {
	     t--;
	    int n = sc.nextInt();
	    int d = sc.nextInt();
	    int[] ar = new int[n];
	    for(int i = 0; i < n; i++)
	        ar[i] = sc.nextInt();
	    reverse(ar, 0, d - 1);
	    reverse(ar, d, n - 1);
	    reverse(ar, 0, n - 1);
	    for(int i = 0; i < n; i++)
	        System.out.print(ar[i] + " ");
	   System.out.println();
	 }
	 }
	 public static void reverse(int[] ar, int low, int high)
	 {
	     while(low < high)
	     {
	         int t = ar[low];
	         ar[low] = ar[high];
	         ar[high] = t;
	         low++;
	         high--;
	     }
	 }
}