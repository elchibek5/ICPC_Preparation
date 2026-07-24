class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        int totalSpace = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') totalSpace++;
        }

        int gap = (wordCount > 1) ? totalSpace / (wordCount - 1) : 0;
        int remaining = (wordCount > 1) ? totalSpace % (wordCount - 1) : totalSpace;

        return String.join(" ".repeat(gap), words) + " ".repeat(remaining);
    }
}
