//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends





class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        ArrayList<String> arr = new ArrayList<>();
        String str = "";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.'){
                arr.add(str);
                str = "";
            }
            else{
                str += S.charAt(i);
            }
        }
        arr.add(str);
        String sol = "";
        for(int i=arr.size()-1;i>=0;i--){
            sol += arr.get(i);
            if(i!=0){
            sol += ".";
            }
        }
        return sol;
        // code here 
    }
}