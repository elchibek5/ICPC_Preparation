class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxFruits = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);

            while (map.size() > 2) {
                int fruitAtLeft = fruits[left];
                // reduce the count by 1
                map.put(fruitAtLeft, map.get(fruitAtLeft) - 1);

                if (map.get(fruitAtLeft) == 0) {
                    map.remove(fruitAtLeft);
                }

                left++;
            }

            maxFruits = Math.max(maxFruits, i - left + 1);
        }

        return maxFruits;
    }
}
