class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char t : tasks) {
            freq[t - 'A']++;
        }

        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int countOfMax = 0;
        for (int f : freq) {
            if (f == maxFreq) {
               countOfMax++; 
            }
        }
        // The key is here
        int ans = (maxFreq - 1) * (n + 1) + countOfMax;

        return Math.max(ans, tasks.length);
        
    }
}
