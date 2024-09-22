//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isMagic(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int isMagic(int N) {
        while (N > 9) {
            int sum = 0;
            while (N != 0) {
                int rem = N % 10;
                sum += rem;
                N = N / 10;
            }
            N = sum;
        }
        if (N == 1) {
            return 1;
        }
        return 0;
    }
}
