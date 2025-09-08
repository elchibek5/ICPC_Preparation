class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int num = 1;
        for (int i = 0; i < n / 2; i++) {
            ans[i] = num;
            ans[n - i - 1] = -num;
            num++;
        }
        return ans;
    }
}
