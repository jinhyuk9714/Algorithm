import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        int minValue = Collections.min(list);
        list.remove(Integer.valueOf(minValue));
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}