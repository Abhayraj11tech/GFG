//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends



class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        if (mat[0][0] == 0) {
            return ans;
        }
        int n = mat.length;
        boolean[][] visited = new boolean[n][n];
        String path = "";
        solve(mat, n, ans, 0, 0, visited, path);
        Collections.sort(ans);
        return ans;
    }

    void solve(int[][] mat, int n, ArrayList<String> ans, int x, int y, boolean[][] visited, String path) {
        if (x == n - 1 && y == n - 1) {
            ans.add(path);
            return;
        }

        visited[x][y] = true;

        if (isSafe(x + 1, y, mat, visited)) {
            solve(mat, n, ans, x + 1, y, visited, path + "D");
        }

        if (isSafe(x, y + 1, mat, visited)) {
            solve(mat, n, ans, x, y + 1, visited, path + "R");
        }

        if (isSafe(x - 1, y, mat, visited)) {
            solve(mat, n, ans, x - 1, y, visited, path + "U");
        }

        if (isSafe(x, y - 1, mat, visited)) {
            solve(mat, n, ans, x, y - 1, visited, path + "L");
        }

        visited[x][y] = false;
    }

    boolean isSafe(int x, int y, int[][] mat, boolean[][] visited) {
        int n = mat.length;
        return x >= 0 && x < n && y >= 0 && y < n && mat[x][y] == 1 && !visited[x][y];
    }
}
