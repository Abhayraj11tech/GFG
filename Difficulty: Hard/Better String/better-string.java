//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GfG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(s1, s2);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static String betterString(String s1, String s2) {
        if (sub(s2, 0, new HashMap<>()) > sub(s1, 0, new HashMap<>())) {
            return s2;
        } else {
            return s1;
        }
    }

    public static int sub(String s, int idx, Map<Integer, Integer> memo) {
        if (idx == s.length()) {
            return 1;
        }
        if (memo.containsKey(idx)) {
            return memo.get(idx);
        }

        int count = sub(s, idx + 1, memo);
        for (int j = idx + 1; j < s.length(); j++) {
            if (s.charAt(j) == s.charAt(idx)) {
                count -= sub(s, j + 1, memo);
                break;
            }
        }

        count += sub(s, idx + 1, memo);
        memo.put(idx, count);
        return count;
    }
}