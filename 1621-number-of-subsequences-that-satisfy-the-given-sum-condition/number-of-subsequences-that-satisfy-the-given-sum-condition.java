import java.util.Arrays;

class Solution {
    private static final int MOD = 1000000007;

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int[] pow = new int[nums.length];
        pow[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }

        int result = 0;

        while (start <= end) {
            if (nums[start] + nums[end] <= target) {
                int diff = end - start;
                result = (result + pow[diff]) % MOD;
                start++;
            } else {
                end--;
            }
        }

        return result;
    }
}
