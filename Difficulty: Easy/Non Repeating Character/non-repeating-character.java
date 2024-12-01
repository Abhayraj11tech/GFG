//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        boolean flag = true;
        String S  = s;
        char sol = ' ';
        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length();j++){
                if(i!=j){
                    if(S.charAt(i)==S.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                
            }
            if(flag == true){
                sol = S.charAt(i);
                break;
            }
            else{
                flag = true;
            }
        }
        //Your code here
        if(sol==(' ')){
            return '$';
        }
        else{
        return sol;
        }
    }
}