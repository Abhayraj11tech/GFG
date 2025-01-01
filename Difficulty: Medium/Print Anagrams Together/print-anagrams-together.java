//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> sol = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            String s = sort(arr[i]);
            if (!set.contains(s)) {
                ArrayList<String> add = new ArrayList<>();
                for (int j = i; j < arr.length; j++) {
                    String cmp = sort(arr[j]);
                    if (cmp.equals(s)) {
                        add.add(arr[j]);
                        set.add(cmp);
                    }
                }
                sol.add(add);
            }
        }
        return sol;
    }

    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}




//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends