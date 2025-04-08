//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());      // Number of vertices
            String[] arrInput = br.readLine().trim().split(" "); // Input for edges

            List<int[]> edges = new ArrayList<>();
            for (int i = 0; i < arrInput.length; i += 2) {
                int u = Integer.parseInt(arrInput[i]);
                int v = Integer.parseInt(arrInput[i + 1]);
                edges.add(new int[] {u, v});
            }

            int m = Integer.parseInt(br.readLine().trim()); // Number of colors

            Solution sol = new Solution();
            System.out.println(sol.graphColoring(n, edges, m) ? "true" : "false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    boolean graphColoring(int v, List<int[]> edges, int m) {
        // code here
        int[] nodeColor = new int[v];
        return backtrack(0, v, edges, m, nodeColor);
    }
    boolean backtrack(int node, int v, List<int[]> edges, int m, int[] nodeColor){
        if(node == v) return true;
        
        for(int color = 1; color <= m; color++){
            if(isSafe(node, edges, color, nodeColor)){
                nodeColor[node] = color;
                if(backtrack(node +1, v,edges, m, nodeColor)) {
                    return true;
                }
                nodeColor[node] =0;
            }
        }
        return false;
    }
    boolean isSafe(int node, List<int[]> edges,int color, int[] nodeColor){
        
        for(int[] edge : edges){
            if(edge[0] == node && nodeColor[edge[1]] == color){
                return false;
            } 
            if(edge[1] == node && nodeColor[edge[0]] == color) {
                return false;
            }
        }
        return true;
    }
}