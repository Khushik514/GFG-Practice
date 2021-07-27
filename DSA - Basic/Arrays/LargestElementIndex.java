import java.util.*;
public class LargestElementIndex
{
    public static void main(String[] args)
    {
        //Time Complexity = O(n)
        //Space Complexity = O(1)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Enter size of array
        int[] ar = new int[n];
        int i = 0;
        for(i = 0; i < n; i++)
            ar[i] = sc.nextInt(); //Enter n array elements
        int max = 0;
        for(i = 1; i < n; i++)
        {
            if(ar[max] < ar[i])
                max = i;
        }
        System.out.println(max); //print index of max element
    }
}