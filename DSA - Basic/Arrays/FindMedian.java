// https://practice.geeksforgeeks.org/problems/find-the-median0527/1
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_fact(v);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find_fact(int[] v)
    {
        int[] count = new int[101];
        for(int i : v)
        {
            count[i]++;
        }
        int k = 0;
        for(int i = 1; i <= 100; i++)
        {
            if(count[i] >= 1)
            {
                v[k] = i;
                k++;
                count[i]--;
                i--;
            }
        }
        //System.out.println(Arrays.toString(v));
        int n = v.length;
        if(n % 2 != 0)
            return v[n / 2];
        else
            return ((v[(n - 1) / 2] + v[(n + 1) / 2]) / 2);
    }
}