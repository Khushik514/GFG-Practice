import java.util.*;
public class MoveAllZeroesToEnd
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
        int low = 0;
        for(int i = 0; i < n; i++)
        {
            if(ar[i] != 0)
            {
                int t = ar[low];
                ar[low] = ar[i];
                ar[i] = t;
                low++;
            }
        }
        System.out.println(Arrays.toString(ar)); //print array
    }
}