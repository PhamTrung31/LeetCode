class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (finalMap.containsKey(target - nums[i])) {
                return new int[] { finalMap.get(target - nums[i]), i };
            }
            finalMap.put(nums[i], i);
        }
        return null;
    }
}