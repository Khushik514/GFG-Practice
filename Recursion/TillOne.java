import java.util.*;
public class TillOne
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tillOne(n);
    }
    public static void tillOne(int n)
    {
        if(n == 0)
            return;
        else
            tillN(n - 1);
            System.out.println(n);
    }
}