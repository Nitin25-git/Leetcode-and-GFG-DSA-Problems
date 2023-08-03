class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0,maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            profit=prices[i]-min;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
        
    }
}