class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            seen.add(n);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
