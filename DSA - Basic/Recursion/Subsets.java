import java.util.*;
public class Subsets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        subsets(s, 0, "");
    }
    public static void subsets(String s, int index, String res)
    {
        if(index == s.length())
        {
            System.out.println(res);
            return;
        }
        subsets(s, index + 1, res);
        subsets(s, index + 1, res + s.charAt(index));
    }
}