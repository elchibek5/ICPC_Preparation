class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int sum = nums.length;
        int odd = 0;
        int even = 1;
        
        while(odd < sum && even < sum) {
            if (nums[odd] % 2 == 0) {
                odd += 2;
            } else if (nums[even] % 2 == 1) {
                even += 2;
            } else {
                int temp = nums[odd];
                temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;

                odd += 2;
                even += 2;
            }
        }
        return nums;
    }
}
