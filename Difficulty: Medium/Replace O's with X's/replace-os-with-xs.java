//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static char[][] fill(int n, int m, char[][] mat) {
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 'O') dfs(mat, i, 0, n, m);
            if (mat[i][m - 1] == 'O') dfs(mat, i, m - 1, n, m);
        }
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 'O') dfs(mat, 0, j, n, m);
            if (mat[n - 1][j] == 'O') dfs(mat, n - 1, j, n, m);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 'O') {
                    mat[i][j] = 'X';
                } else if (mat[i][j] == '*') {
                    mat[i][j] = 'O';
                }
            }
        }

        return mat;
    }

    static void dfs(char[][] mat, int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m || mat[i][j] != 'O') return;

        mat[i][j] = '*';

        dfs(mat, i - 1, j, n, m);
        dfs(mat, i + 1, j, n, m);
        dfs(mat, i, j - 1, n, m);
        dfs(mat, i, j + 1, n, m);
    }
}
