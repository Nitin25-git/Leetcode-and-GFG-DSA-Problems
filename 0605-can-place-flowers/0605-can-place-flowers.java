class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int next=0;
        int prev=0;
        int count=0;
        int n1=flowerbed.length;
        for(int i=0;i<n1;i++)
        {
            if(flowerbed[i]==0)
            {
                if(i==0)
                 prev=0;
                else
                    prev=flowerbed[i-1];
            
            
                if(i==n1-1)
                    next=0;
                else
                    next=flowerbed[i+1];
            
            
            if(next==0 && prev==0)
            {
                flowerbed[i]=1;
                count++;
            }
        }
        }
        return count>=n;
        
    }
}