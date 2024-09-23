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
            int ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int sumOfDivisors(int N){
        // code here
        ArrayList<Integer> div = new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(N%i==0){
                div.add(i);
            }
        }
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=0;i<div.size();i++){
            int val = div.get(i);
            int sum = 0;
            for(int j=1;j<=val;j++){
                if(val%j==0){
                    sum += j;
                }
            }
            sol.add(sum);
        }
        int res = 0;
        for(int i=0;i<sol.size();i++){
            res += sol.get(i);
        }
        return res;

    }
}