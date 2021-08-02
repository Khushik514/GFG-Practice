import java.util.*;
public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n, 0));
    }
    public static int sum(int n, int res)
    {
        if(n == 0)
            return res;
        res = res + n % 10;
        return sum(n / 10, res);
    }
}