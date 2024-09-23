//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends



class Solution {
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) return "-1";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        int start = 0, count = 0, left = 0;
        String sol = "-1";

        HashMap<Character, Integer> windowMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (map.containsKey(c) && windowMap.get(c) <= map.get(c)) {
                count++;
            }

            while (count == p.length()) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    sol = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (map.containsKey(leftChar) && windowMap.get(leftChar) < map.get(leftChar)) {
                    count--;
                }
                left++;
            }
        }

        return sol;
    }
}
