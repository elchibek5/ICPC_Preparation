class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] answer = new int[size];
        int aim_pointer = (size - (k % size)) % size;

        for (int i = 0; i < size; i++) {
            answer[i] = nums[aim_pointer++];
            if (aim_pointer == size) {
                aim_pointer = 0;
            }
        }

        for (int i = 0; i < size; i++) {
            nums[i] = answer[i];
        }
    }
}
