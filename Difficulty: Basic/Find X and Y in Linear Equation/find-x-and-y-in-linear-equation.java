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
            String S[] = read.readLine().split(" ");
            
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int N = Integer.parseInt(S[2]);
            
            Solution ob = new Solution();
            int[] ptr = ob.findXandY(A,B,N);
            System.out.println(ptr[0]+" "+ptr[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int[] findXandY(int A, int B, int N) {
        int[] result = {-1, -1};

        int maxX = N / A;
        int maxY = N / B;

        for (int i = 0; i <= maxX; i++) {
            for (int j = 0; j <= maxY; j++) {
                if (A * i + B * j == N) {
                    return new int[] {i, j};
                }
            }
        }

        return result;
    }
}
