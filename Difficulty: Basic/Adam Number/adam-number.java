//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkAdamOrNot(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String checkAdamOrNot(int N) {
        int val = N;
        int rev1 = 0;
        while(N!=0){
            int rem = N%10;
            rev1 = rev1*10+ rem;
            N = N/10;
        }
        rev1 *= rev1;
        val *= val;
        int chk = 0;
        while(rev1!=0){
            int rm = rev1%10;
            chk = chk*10+ rm;
            rev1 = rev1/10;
        }
        if(chk==val){
            return "YES";
        }
        else{
            return "NO";
        }
        
    }
}