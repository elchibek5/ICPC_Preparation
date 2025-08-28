class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                swap(nums, pointer++, i);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int odd, int even) {
        int temp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = temp;
    }
}
