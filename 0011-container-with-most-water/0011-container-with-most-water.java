class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=Integer.MIN_VALUE;
        while(left<=right)
        {
            int min=Math.min(height[left],height[right]);
            int width=right-left;
            maxarea=Math.max(maxarea,min*width);
            
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxarea;
        
    }
}