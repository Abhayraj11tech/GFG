//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
       Stack<Integer> nums=new Stack<>();
        Stack<String> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        
        int num=0;
        
        for(int i=0; i<s.length(); i++){
            
            if(Character.isDigit(s.charAt(i))){
                num=num*10 + (s.charAt(i)-'0');
                
            }
            else if((s.charAt(i)+"").equals("[")){
                nums.add(num);
                st.add(s.charAt(i)+"");
                num=0;
            }
            
            else if((s.charAt(i)+"").equals("]")){
                while(!st.peek().equals("[")){
                    ans.insert(0,st.pop());
                }
                
                st.pop();
               
               int n=nums.pop();
               String m="";
               for(int j=0; j<n; j++){
                    m+=ans.toString();
               }
               st.push(m);
               ans.setLength(0);
                
            }
            else{
                st.push(s.charAt(i)+"");
            }
        }
        
           
        StringBuilder fin=new StringBuilder();
         while(!st.isEmpty()){
           fin.append(st.pop());
        }
        
        return fin.toString();
    }
}