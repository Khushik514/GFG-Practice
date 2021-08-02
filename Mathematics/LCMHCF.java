import java.util.*;
public class NoOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = sc.nextInt();
        int hcf = gcd(n, nn);
        int lcm = (n * nn) / hcf;
        System.out.println(lcm + " " + hcf);
    }
    public static int gcd(int a, int b)
    {
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }
}