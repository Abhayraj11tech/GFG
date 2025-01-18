//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String text = sc.next();
            String pat = sc.next();
            Solution obj = new Solution();
            int res = obj.findMatching(text, pat);
            System.out.println(res);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMatching(String haystack, String needle) {
        int p = 0;
        int count = 0;
        int sol = -1;
        boolean flag = false;
        
        if (needle.isEmpty()) {
            sol = 0;
        } else if (haystack.equals(needle)) {
            sol = 0;
        } else if (needle.length() > haystack.length()) {
            sol = -1;
        } else {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    p = 0;
                    count = 0;
                    for (int j = i; j < haystack.length() && p < needle.length(); j++) {
                        if (haystack.charAt(j) == needle.charAt(p)) {
                            count++;
                            p++;
                        } else {
                            break;
                        }
                    }
                    if (count == needle.length()) {
                        flag = true;
                        sol = i;
                        break;
                    }
                }
            }
        }
        
        return sol;
    }
}
