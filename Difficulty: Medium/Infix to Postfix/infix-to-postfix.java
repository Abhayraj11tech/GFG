//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        String sol = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                sol += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sol += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    sol += stack.pop();
                }
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty()) {
            sol += stack.pop();
        }
        
        return sol;
    }

    private static int precedence(char c) {
        if (c == '^'){
          return 3;  
        }
        if (c == '*' || c == '/') {
            return 2;
        }
        if (c == '+' || c == '-'){ 
            return 1;
        }
        return -1;
    }
}
