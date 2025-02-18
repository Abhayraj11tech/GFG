//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends


class Solution {     
    public int[][] kClosest(int[][] points, int k) {         
        int[][] val = new int[points.length][2];  

        for (int i = 0; i < points.length; i++) {             
            int x1 = points[i][0];             
            int y1 = points[i][1];             
            int dt = (x1 * x1) + (y1 * y1);
            val[i][0] = dt;             
            val[i][1] = i;         
        }         

        Arrays.sort(val, (a, b) -> Integer.compare(a[0], b[0])); 

        int[][] sol = new int[k][2];

        for (int i = 0; i < k; i++) { 
            sol[i] = points[val[i][1]]; 
        }

        return sol;                       
    } 
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] points = new int[n][2];
            for (int i = 0; i < n; i++) {
                points[i][0] = scanner.nextInt();
                points[i][1] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int[][] ans = solution.kClosest(points, k);

            Arrays.sort(ans, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });
            for (int[] point : ans) {
                System.out.println(point[0] + " " + point[1]);
            }
            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends