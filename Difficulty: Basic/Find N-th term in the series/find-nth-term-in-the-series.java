//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthOfSeries(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long nthOfSeries(long n){
        // code here
        if(n==0){
            return 9;
        }
        if(n==1){
            return 33;
        }
        long val = 33;
        long add = 40;
        for(int i=2;i<n;i++){
            val += add;
            add += 16;
        }
        return val;
    }
}