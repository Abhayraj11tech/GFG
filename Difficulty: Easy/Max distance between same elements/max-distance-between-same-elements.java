//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends



class Solution {
    public int maxDistance(int[] arr) {
        int sol = -1;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> elm = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (!elm.containsKey(val)) {
                elm.put(val, i);
            } else {
                int a = elm.get(val);
                int b = i;
                int diff = b - a;
                if (diff > max) {
                    sol = diff;
                    max = diff;
                }
            }
        }
        
        return sol;
    }
}





//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxDistance(arr));
        }
        sc.close();
    }
}
// } Driver Code Ends