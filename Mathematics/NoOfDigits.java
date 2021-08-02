import java.util.*;
public class NoOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Iterative Solution - O(n)
        int d = 0;
        while(n > 0)
        {
            d++;
            n /= 10;
        }
        System.out.println(d);
        //Logarithmic Solution - O(1)
        int dig = (int)Math.floor(Math.log10(n) + 1);
        System.out.println(dd);
    }
}