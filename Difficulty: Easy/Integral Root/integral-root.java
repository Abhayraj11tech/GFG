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
            String arr[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(arr[0]);
            int K = Integer.parseInt(arr[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.integralRoot(N, K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long integralRoot(int N, int K){
        // code here
        return (long)Math.pow(N+1,K)-(long)Math.pow(N,K); 
    }
}