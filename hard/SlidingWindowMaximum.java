class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return nums;

        int[] answer = new int[n - k + 1];
        int left = 0;
        int right = k;
        int idx = 0;

        while (right <= n) {
            int max = Integer.MIN_VALUE;
            for (int i = left; i < right; i++) {
                if (nums[i] > max) max = nums[i];
            }
            answer[idx++] = max;
            left++;
            right++;
        }
        return answer;
    }
}
