//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
         int max = 0;
        int left = 0, right = 0;
        String s = S;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            
            if (left == right) {
                max = Math.max(max, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }
        
        left = right = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            
            if (left == right) {
                max = Math.max(max, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }
        
        return max;
    }
}