import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}