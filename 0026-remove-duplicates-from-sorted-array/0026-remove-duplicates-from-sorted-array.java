class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n == 0 || n == 1){
            return n;
        }

        int i = 1, j = 1;
        while(j < n){
            if(nums[j] != nums[j -1]){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}