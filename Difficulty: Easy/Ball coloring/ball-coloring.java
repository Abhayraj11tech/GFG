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

            System.out.println(ob.noOfWays(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long noOfWays(long n){
         if(n==1) {
             return 2;
         }

        else  {
            return (n*n)-(n-2);
        }
    }
}