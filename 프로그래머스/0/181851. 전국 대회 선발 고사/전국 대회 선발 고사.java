import java.util.*;
class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(i, rank[i]);
            }
        }

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Comparator.comparing(Map.Entry::getValue));

        int a = sortedList.get(0).getKey();
        int b = sortedList.get(1).getKey();
        int c = sortedList.get(2).getKey();

        return 10000 * a + 100 * b + c;
    }
}