//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isPossible(int N){
        // code here
        
           return ( N = 100 - N ) >= N % 3 * 7 ? 1 : 0;
    }
}