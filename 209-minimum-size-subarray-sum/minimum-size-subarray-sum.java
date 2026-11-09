class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        // Expand window
        while (high < nums.length) {
            sum = sum + nums[high];
            high++;

            // Shrink window if sum >= target
            while (sum >= target) {

                // Update minimum length
                min = Math.min(min, high - low);

                // Remove first element
                sum = sum - nums[low];
                low++;
            }
        }

        // No valid subarray found
        if (min == Integer.MAX_VALUE) {
            return 0;
        }

        return min;
    }
}