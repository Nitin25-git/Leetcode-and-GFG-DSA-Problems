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


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
        if (n == 0) {
            return 0;
 }      
         int i, rowStart = 0, colStart = 0;
         k=k-1;
        int numElements = n * m, count = 0;
        while(count < numElements){
            for(i = colStart; count < numElements && i < m; ++i) {
                   if(count==k)
                      return A[rowStart][i];
                  count++;
            }           
            rowStart++;
            for(i = rowStart; count < numElements && i < n; ++i) {

                 if(count==k)
                      return A[i][m - 1];
                  count++;

            }

            m--;

            for(i = m - 1; count < numElements && i >= colStart; --i) {

                if(count==k)
                      return A[n - 1][i] ;
                  count++;
            }
            n--;
            for(i = n - 1; count < numElements && i >= rowStart; --i) {
                    if(count==k)
                      return A[i][colStart];
                  count++;
            }
          colStart++;
        }
        return 0;
    }
}



