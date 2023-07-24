class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int ans=m+n-1;
        
        while(i>=0 && j>=0)
        {
            if(nums1[i]>=nums2[j])
            {
                nums1[ans]=nums1[i];
                ans--;
                i--;
            }
            else if(nums1[i]<nums2[j])
            {
                nums1[ans]=nums2[j];
                ans--;
                j--;
            }
        }
        while(i>=0)
        {
            nums1[ans--]=nums1[i--];
        }
        while(j>=0)
        {
            nums1[ans--]=nums2[j--];
        }
        
    }
}