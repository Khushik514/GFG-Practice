import java.util.*;
public class LexographicRank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int res = 1;
        int mul = fact(n);
        int[] count = new int[256];
        for(int i = 0; i < n; i++)
            count[(int)s.charAt(i)]++;
        for(int i = 1; i < 256; i++)
            count[i] = count[i] + count[i - 1];
        for(int i = 0; i < n; i++)
        {
            mul = mul / (n - i);
            res = res + count[(int)s.charAt(i) - 1] * mul;
            for(int j = s.charAt(i); j < 256; j++)
                count[j]--;
        }
        System.out.println(res);
    }
    public static int fact(int n)
    {
        int f = 1;
        for(int i = 2; i <= n; i++)
            f *= i;
        return f;
    }