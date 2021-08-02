import java.util.*;
public class LinearSearch
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
        int x = sc.nextInt(); //Enter the number to search for.
        for(i = 0; i < n; i++)
        {
            if(ar[i] == x)
                break;
        }
        if(i == n)
            System.out.println("Not Found");
        else
            System.out.println("Found at index -> " + i);
    }
}