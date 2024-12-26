//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[0]);

            String line = br.readLine();
            String[] tokens = line.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            boolean ans = new Solution().twoSum(arr, x);
            System.out.println(ans ? "true" : "false");
            // System.out.println("~");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            int search = target - val;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == search) {
                    return true;
                } else if (arr[mid] < search) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
