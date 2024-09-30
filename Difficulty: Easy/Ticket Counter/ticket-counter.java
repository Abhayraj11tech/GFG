//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends


class Solution {
    public static int distributeTicket(int N, int K) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }

        int left = 0, right = N - 1;

        while (left < right) {
            for (int i = 0; i < K && left < right; i++) {
                left++;
            }
            for (int i = 0; i < K && left < right; i++) {
                right--;
            }
        }

        return arr.get(left);
    }
}
