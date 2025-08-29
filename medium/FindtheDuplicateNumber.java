class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (!seen.add(x)) return x;  
        }
        return -1; 
    }
}
