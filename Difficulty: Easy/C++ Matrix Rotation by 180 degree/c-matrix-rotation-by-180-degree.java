//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.rotate(matrix);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = temp;
            }
        }

        if (n % 2 != 0) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n / 2][j];
                matrix[n / 2][j] = matrix[n / 2][n - 1 - j];
                matrix[n / 2][n - 1 - j] = temp;
            }
        }
    }
}
