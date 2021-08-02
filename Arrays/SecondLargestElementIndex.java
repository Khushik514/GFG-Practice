import java.util.*;
public class SecondLargestElementIndex
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
        int max = 0;
        int max1 = -1;
        for(int i = 1; i < n; i++)
        {
            if(ar[max] < ar[i])
            {
                max1 = max;
                max = i;
            }
            else if(max1 == -1 || ar[max] > ar[i] && ar[i] > ar[max1])
                max1 = i;
        }
        System.out.println(max1); //print index of second largest element
    }
}