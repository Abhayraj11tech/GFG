//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String number = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.multiplyby11(number));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String multiplyby11(String number) 
    {  
        int n=number.length();
        StringBuilder sb=new StringBuilder();
        int carry=0;
        for(int i=n-1;i>=0;i--){
            int x=Integer.parseInt(String.valueOf(number.charAt(i)));
            int m=x*11+carry;
            sb.append(m%10);
            carry=m/10;
        }
        sb.reverse();
        
        if(carry!=0){
            return String.valueOf(carry)+sb;
        }
        return sb.toString();
    }

}