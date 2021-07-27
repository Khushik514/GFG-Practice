import java.util.*;
public class ReverseAnArray
{
    public static void main(String[] args)
    {
        //Time Complexity = O(n)
        //Space Complexity = O(1)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Enter size of array
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt(); //Enter n array elements
        for(int i = 0; i < n / 2; i++)
        {
            int t = ar[i];
            ar[i] = ar[n - i - 1];
            ar[n - i - 1] = t;
        }
        System.out.println(Arrays.toString(ar)); //print reversed array
    }
}