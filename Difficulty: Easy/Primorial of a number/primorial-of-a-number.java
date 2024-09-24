//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        ob.precompute();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            long N = Long.parseLong(input_line[0]);
            long ans = ob.primorial(N);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Solution{
  static boolean isprime(long n)
   {
       if(n<=1)
       {
           return false;
       }
       for(int i=2;i<=Math.sqrt(n);i++)
       {
           if(n%i==0)
           {
               return false;
           }
       }
       return true;
   }
   void precompute(){
       // Code Here
   }
   long  primorial(long N){
       long fact=1;
       long M = 1000000007;
       for(long i=N;i>=2;i--)
       {
           if(isprime(i))
           {
               fact=fact*i;
               fact =  fact%M;
           }
       }
       return  fact;
   }
}