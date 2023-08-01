class Solution {
    public int maxProfit(int[] prices) {
        
        int minsofar=prices[0];
        
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            minsofar=Math.min(minsofar,prices[i]);
            int profit=prices[i]-minsofar;
            max=Math.max(profit,max);
        }
        return max;
        
    }
}