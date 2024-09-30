//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    static void gfSeries(int N) {
        if (N <= 0) {
            System.out.println(); 
            return;
        }

        long[] sol = new long[N];

        if (N > 0) {
            sol[0] = 0;
        }
        if (N > 1) {
            sol[1] = 1;
        }

        for (int i = 2; i < N; i++) {
            sol[i] = (sol[i - 2] * sol[i - 2]) - sol[i - 1];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(sol[i] + " ");
        }
        System.out.println();
    }
}
