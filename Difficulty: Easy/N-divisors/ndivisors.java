//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int N = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.count(A,B,N));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int count(int A, int B, int N) {  
        int[] res = new int[B + 1];
        
        for (int i = 1; i <= B; i++) {
            for (int j = i; j <= B; j += i) {
                res[j]++;
            }
        }
        
        int sol = 0;
        for (int i = A; i <= B; i++) {
            if (res[i] == N) {
                sol++;
            }
        }
        
        return sol;
    }
}
