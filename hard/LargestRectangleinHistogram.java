class Solution {
    public int largestRectangleArea(int[] heights) {

        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                int width = right - left - 1;
                int area = heights[mid] * width;
                max = Math.max(max, area);
            }
            stack.push(i);
        }
        
        int right = heights.length;
        while (!stack.isEmpty()) {
            int mid = stack.pop();
            int left = stack.isEmpty() ? -1 : stack.peek();
            int width = right - left - 1;
            int area = heights[mid] * width;
            max = Math.max(max, area);
        }

        return max;
    }
}
