//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String str) {
        Stack<String> s = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                s.push(Character.toString(c));
            } else {
                String s1 = s.pop();
                String s2 = s.pop();
                s.push("(" + s1 + c + s2 + ")");
            }
        }
        return s.pop();
    }
}
