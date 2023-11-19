class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0)
            return new int[][]{};
        int row=n;
        int col=n;
        int arr[][]=new int[row][col];
        int count=0;
        int rs=0;
        int cs=0;
        int re=n;
        int ce=n;
        int elements=row*col;
        while(count<elements)
        {
            for(int i=cs;count<=elements && i<ce;i++)
            {
                count++;
              arr[rs][i]=count;  
            }
            rs++;
            
            for(int i=rs;count<=elements && i<re;i++)
            {
                count++;
                arr[i][ce-1]=count;
            }
            ce--;
            
            for(int i=ce-1;count<=elements && i>=cs;i--)
            {
                count++;
                arr[re-1][i]=count;
            }
            re--;
            
            for(int i=re-1;count<=elements && i>=rs;i--)
            {
                count++;
                arr[i][cs]=count;
            }
            cs++;
        }
        return arr;
        
    }
}