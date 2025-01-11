//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int longestUniqueSubstr(String S) {
        StringBuilder strBuilder = new StringBuilder();
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            
            while (strBuilder.indexOf(String.valueOf(c)) != -1) {
                strBuilder.deleteCharAt(0);
            }
            
            strBuilder.append(c);
            
            max = Math.max(max, strBuilder.length());
        }
        
        return max;
    }
}
