//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
     private int[] leftSmaller(int[] arr, int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    private int[] rightSmaller(int[] arr, int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
    
    public int findMaxDiff(int[] arr) {
        int n = arr.length;
        int left[] = leftSmaller(arr, n);
        int right[] = rightSmaller(arr, n);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, Math.abs(left[i] - right[i]));
        }
        return ans;
    }
}
