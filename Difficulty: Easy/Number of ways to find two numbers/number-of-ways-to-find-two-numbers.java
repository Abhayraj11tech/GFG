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
            int K = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numOfWays(K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static Long numOfWays(int K) {
        long sol = 0;
        for (int a = 1; a < K; a++) {
            int val = K - a;
            if (val > a) {
                sol += (val - a);
            }
        }
        return sol;
    }
}
