class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public void sortColors(int[] nums) {
        int min_index;
        for (int i = 0; i < nums.length; i++) {
            min_index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;
                }
            }
            swap(nums, i, min_index);
        }
    }
}