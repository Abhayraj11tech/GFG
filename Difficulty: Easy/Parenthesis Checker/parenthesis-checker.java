//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends





class Solution
{
     static boolean isMatching(char a, char b)
    {
        if(a == '(' && b == ')')
            return true;
        
        if(a == '[' && b == ']')
            return true;
        
        if(a == '{' && b == '}')
            return true;
        
        return false;
    }
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Deque<Character>stack=new ArrayDeque<>();
        
        boolean isEmpty=false;
         boolean isMatching=false;
        
        for(int i=0;i<x.length();i++){
            char n=x.charAt(i);
            
            if(n=='(' || n=='{' || n=='['){
                stack.push(n);
            }
            else{
                if(stack.isEmpty()==true){
                    return false;
                }
                else if(isMatching(stack.peek(),n)==false){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        // add your code here
        return(stack.isEmpty());
    }
}
