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
            
            Long X = Long.parseLong(S[0]);
            Long K = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.smallestKDigitNum(X,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static Long smallestKDigitNum(Long X, Long K) {
        long start = (long) Math.pow(10, K - 1);
        long end = (long) Math.pow(10, K);

        for (long i = start; i < end; i++) {
            if (i % X == 0) {
                return i;
            }
        }
        return 0L;
    }
}
