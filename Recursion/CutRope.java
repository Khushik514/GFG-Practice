import java.util.*;
public class CutRope
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(numberOfPieces(n, a, b, c, 0));
    }
    public static int numberOfPieces(int n, int a, int b, int c, int res)
    {
        if(n == 0)
            return res;
        if(n < 0)
            return 0;
        int res1 = numberOfPieces(n - a, a, b, c, res + 1);
        int res2 = numberOfPieces(n - b, a, b, c, res + 1);
        int res3 = numberOfPieces(n - c, a, b, c, res + 1);
        return (int)(Math.max(Math.max(res1, res2), res3));
    }
}