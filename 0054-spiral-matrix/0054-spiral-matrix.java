class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int nrows=matrix.length;
                List<Integer> list=new ArrayList<>();

        if(nrows==0)
            return list;
        int ncols=matrix[0].length;
        int startrow=0;
        int startcol=0;
        int endrow=nrows;
        int endcol=ncols;
        // List<Integer> list=new ArrayList<>();
        
        int total=nrows*ncols;
        int count=0;
        while(count<total)
        {
            for(int i=startcol;count<total && i<endcol;i++)
            {
                list.add(matrix[startrow][i]);
                count++;
            }
            startrow++;
            
            for(int i=startrow;count<total && i<endrow;i++)
            {
                list.add(matrix[i][endcol-1]);
                count++;
            }
            endcol--;
            
            for(int i=endcol-1;count<total && i>=startcol;i--)
            {
                list.add(matrix[endrow-1][i]);
                count++;
            }
            endrow--;
            
            for(int i=endrow-1;count<total && i>=startrow;i--)
            {
                list.add(matrix[i][startcol]);
                count++;
            }
            startcol++;
        }
        return list;
        
    }
}