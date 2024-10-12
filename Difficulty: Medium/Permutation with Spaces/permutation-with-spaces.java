//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);

            for (int i = 0; i < ans.size(); i++) {
                System.out.print("(" + ans.get(i) + ")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends



class Solution {
    ArrayList<String> permutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        solve(s, "", 0, result);
        Collections.sort(result);
        return result;
    }

    void solve(String s, String current, int index, ArrayList<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        solve(s, current + s.charAt(index), index + 1, result);

        if (index < s.length() - 1) {
            solve(s, current + s.charAt(index) + " ", index + 1, result);
        }
    }
}
