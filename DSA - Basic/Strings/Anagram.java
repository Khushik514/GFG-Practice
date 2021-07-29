import java.util.*;
public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] count = new int[256];
        int i = 0;
        for(i = 0; i < s1.length(); i++)
        {
            count[(int)s1.charAt(i)]++;
        }
        for(i = 0; i < s2.length(); i++)
        {
            if(count[(int)s2.charAt(i)] == 0)
                break;
            else
                count[(int)s2.charAt(i)]--;
        }
        if(i == s2.length())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}