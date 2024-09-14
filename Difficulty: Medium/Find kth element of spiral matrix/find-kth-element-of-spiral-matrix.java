//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends



class Solution {
    int findK(int[][] A, int n, int m, int k) {
        ArrayList<Integer> sol = new ArrayList<>();
        int count = 0;
        int startR = 0;
        int startC = 0;
        int endR = n - 1;
        int endC = m - 1;
        
        while (count < n * m) {
            for (int i = startC; count < n * m && i <= endC; i++) {
                sol.add(A[startR][i]);
                count++;
            }
            startR++;
            
            for (int i = startR; count < n * m && i <= endR; i++) {
                sol.add(A[i][endC]);
                count++;
            }
            endC--;
            
            for (int i = endC; count < n * m && i >= startC; i--) {
                sol.add(A[endR][i]);
                count++;
            }
            endR--;
            
            for (int i = endR; count < n * m && i >= startR; i--) {
                sol.add(A[i][startC]);
                count++;
            }
            startC++;
        }
        
        return sol.get(k - 1);
    }
}
