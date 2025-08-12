class Solution {
    public void sortColors(int[] nums) {
        boolean swapped = true;
        
        while (swapped) {
            swapped = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    int answer = 0;
                    answer = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = answer;
                    swapped = true;
                } 
            }
        }
    }
}
