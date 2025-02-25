//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static int getMaxArea(int heights[]) {
        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n]; 
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        int Max = 0;

        for (int j = n - 1; j >= 0; j--) {
            while (!s1.isEmpty() && heights[s1.peek()] >= heights[j]) {
                s1.pop();
            }
            nsr[j] = s1.isEmpty() ? n : s1.peek();
            s1.push(j);
        }

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        for (int p = 0; p < n; p++) {
            res[p] = heights[p] * (nsr[p] - nsl[p] - 1);
        }
        for (int m = 0; m < n; m++) {
            Max = (int)Math.max(Max, res[m]);
        }

        return Max;
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.getMaxArea(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends