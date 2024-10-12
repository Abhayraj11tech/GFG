//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            String ans = obj.divisorGame(n) ? "True" : "False";
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean divisorGame(int n) {
        int count = 0;
        while (n != 0) {
            boolean flag = false;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count = (count == 0) ? 1 : 0; 
                    n -= i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        return count != 0;
    }
}
