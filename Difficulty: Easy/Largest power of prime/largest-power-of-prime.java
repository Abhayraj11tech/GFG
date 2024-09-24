//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int p = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.largestPowerOfPrime(N,p));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int largestPowerOfPrime(int N, int p) {
        // code here
       int ans=0;
       for(int i=p;i<=N;i*=p){
           ans += N/i;
       }
       return ans;
    }
}