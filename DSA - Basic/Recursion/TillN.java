import java.util.*;
public class TillN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tillN(n);
    }
    public static void tillN(int n)
    {
        if(n == 0)
            return;
        else
            System.out.println(n);
            tillN(n - 1);
    }
}