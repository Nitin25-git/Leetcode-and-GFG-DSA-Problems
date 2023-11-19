class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int no = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[no];
                nums[no] = temp;
                no++; 
            }
        }
        
        return nums;
    }
}
