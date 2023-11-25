class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        if(row==0)
            return;
        int col=matrix[0].length;
        int a[]=new int[row];
        int b[]=new int[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                  a[i]=1;
                  b[j]=1;
                    
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i]==1 || b[j]==1)
                    matrix[i][j]=0;
            }
        }
        
    }
}