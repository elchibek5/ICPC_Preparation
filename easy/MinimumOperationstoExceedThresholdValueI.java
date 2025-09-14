class Solution {
    public int minOperations(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) return answer;
            answer++;
        }
        return answer;
    }
}
