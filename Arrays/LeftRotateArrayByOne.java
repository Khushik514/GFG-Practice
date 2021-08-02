import java.util.*;
public class LeftRotateArrayByOne
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
        int first = ar[0];
        for(int i = 0; i < n - 1; i++)
        {
            ar[i] = ar[i + 1];
        }
        ar[n - 1] = first;
        System.out.println(Arrays.toString(ar)); //print array
    }
}