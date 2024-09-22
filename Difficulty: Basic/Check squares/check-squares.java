//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.checkSquares(N));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int checkSquares(int N) {
          int x = (int)Math.sqrt(N);
        for(int i=0; i<=x; i++){
            for(int j=0; j<=i; j++){
                if(((i*i)+(j*j)) == N){
                    return 1;
                }
            }
        }
        return 0;
    }
}