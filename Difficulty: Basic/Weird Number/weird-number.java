//{ Driver Code Starts
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
            Solution ob = new Solution();
            int ans = ob.is_weird(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution {
    public int is_weird(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                arr.add(i);
                sum += i;
            }
        }

        if (sum <= n) {
            return 0;
        }

        int len = arr.size();
        boolean[][] dp = new boolean[len + 1][n + 1];

        for (int i = 0; i <= len; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr.get(i - 1) <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr.get(i - 1)];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[len][n] ? 0 : 1;
    }

}