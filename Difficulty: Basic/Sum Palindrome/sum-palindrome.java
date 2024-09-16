//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static long isSumPalindrome(long n) {
        int count = 0;
        while (true) {
            String s1 = Long.toString(n);
            String s2 = new StringBuilder(s1).reverse().toString();
            
            if (s1.equals(s2)) {
                return n;
            }
            
            n = n + Long.parseLong(s2);
            ++count;
            if (count>5) {
                return -1;
            }
        }
    }
}
