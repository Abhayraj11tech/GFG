//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public int maxWater(int height[]) {
       	  int l = 0, r = height.length - 1;
        int sol = 0;
        while (l < r) {
            int wd = r - l;
            int ht = Math.min(height[l], height[r]);
            int val = wd * ht;
            sol = Math.max(sol, val);
            if (height[l] > height[r]) {
                --r;
            } else {
                ++l;
            }
        }
        return sol;
    }
}