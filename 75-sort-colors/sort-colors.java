class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                // 0 belongs at the beginning
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {
                // 1 is already in the correct middle section
                mid++;

            } else {
                // 2 belongs at the end
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
                // Don't increase mid because the new value needs checking before swipping!!
            }
        }
    }
}