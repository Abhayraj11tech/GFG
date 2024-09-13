//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        Solution ob = new Solution();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

 
// User function Template for Java
class Solution {
    public String pattern(int[][] arr) {
        // Code here
        int cnt;
        for(int i=0;i<arr.length;i++){
            cnt=0;
            for(int j=0;j<=arr.length/2;j++){
                if(arr[i][j]==arr[i][arr.length-j-1]){
                    cnt++;
                }
            }
            if(cnt==((arr.length)/2)+1) return i+" R";
        }
        for(int i=0;i<arr.length;i++){
            cnt=0;
            for(int j=0;j<=arr.length/2;j++){
                if(arr[j][i]==arr[arr.length-j-1][i]){
                    cnt++;
                }
            }
            if(cnt==((arr.length)/2)+1) return i+" C";
        }
        return "-1";
    }
}