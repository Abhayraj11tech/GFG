//{ Driver Code Starts
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
            String  lines = br.readLine();
            String[] strs = lines.trim().split("\\s+");
            
            int n = Integer.parseInt(strs[0]);
            char c = strs[1].charAt(0);
            Solution ob = new Solution();
            int ans = ob.waiting_time(n, c);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution {
    public int waiting_time(int n, char c) {
        if (c == 'U') {
            if (n <= 11) {
                return 11 - n;
            } else {
                return 8 + (19 - n);
            }
        } else {
            if (n >= 11) {
                return n - 11;
            } else {
                return 11 + n;
            }
        }
    }
}
