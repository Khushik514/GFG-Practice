import java.util.*;
public class LeftmostRepeatCharacter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[256];
        int i = 0;
        for(i = 0; i < s.length(); i++)
        {
            int index = (int)s.charAt(i);
            count[index]++;
        }
        for(i = 0; i < s.length(); i++)
        {
            int index = (int)s.charAt(i);
            if(count[index] >= 2)
            {
                System.out.println(i);
                break;
            }
        }
        if(i == s.length())
            System.out.println(-1);
    }
}