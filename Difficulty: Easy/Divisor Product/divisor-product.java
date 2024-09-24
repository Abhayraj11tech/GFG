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
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.divisorProduct(N));
        }
    }
}
// } Driver Code Ends

class Solution {
    static Long divisorProduct(Long N) {
        long pro = 1;
        long mod = 1000000007;
        for(long i = 1; i * i <= N; i++) {
            if(N % i == 0) {
                pro = (pro * i) % mod;
                if(i != N / i) {
                    pro = (pro * (N / i)) % mod;
                }
            }
        }
        return pro;
    }
}
