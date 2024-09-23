//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends

class Solution {
    static final int MOD = 1000000007;

    static int nthFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = (n1 + n2) % MOD;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
}
