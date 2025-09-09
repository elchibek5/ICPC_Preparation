class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums1) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        } 

        int[] temp = new int[nums1.length];
        int k = 0;

        for (int y : nums2) {
            int count = freq.getOrDefault(y, 0);
            if (count > 0) {
                temp[k++] = y;
                freq.put(y, count - 1);

            }
        }
        return Arrays.copyOf(temp, k);
    }
}
