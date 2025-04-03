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
            String ans = obj.postToPre(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    static boolean isOperator(char x)
    {

        switch (x) {
        case '+':
        case '-':
        case '/':
        case '*':
            return true;
        }
        return false;
    }

    static String postToPre(String post_exp)
    {
        Stack<String> s = new Stack<String>();

        int length = post_exp.length();

        for (int i = 0; i < length; i++) {

            if (isOperator(post_exp.charAt(i))) {

                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();

                String temp
                    = post_exp.charAt(i) + op2 + op1;

                s.push(temp);
            }

            else {

                s.push(post_exp.charAt(i) + "");
            }
        }

       
        String ans = "";
        for (String i : s)
            ans += i;
        return ans;
    }

}