//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int S1 = Integer.parseInt(arr[0]);
            int S2 = Integer.parseInt(arr[1]);
            int N = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(S1, S2, N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minTime(int S1, int S2, int N)
    {int val1 = S1 * N;
        int val2 = S2 * N;
        int sol = Math.min(val1, val2);

        for (int i = 0; i <= N; i++) {
            int val = Math.max(S1 * i, S2 * (N - i));
            sol = Math.min(sol, val);
        }

        return sol;
    }
}
