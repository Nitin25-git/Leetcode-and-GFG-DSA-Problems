class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int next=0;
        int pvs=0;
        int count=0;
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
             pvs=(i==0)?0:flowerbed[i-1];
             next=(i==flowerbed.length-1)?0:flowerbed[i+1];
            
            if(next==0 && pvs==0)
            {
                flowerbed[i]=1;
                count++;
            }
        }
            }
        return count>=n;
        
    }
}