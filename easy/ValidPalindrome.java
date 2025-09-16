class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        String lower = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char ch : lower.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        StringBuilder reversed = new StringBuilder(sb);
        reversed.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != reversed.charAt(i)) return false;
        }
        return true;
    }
}
