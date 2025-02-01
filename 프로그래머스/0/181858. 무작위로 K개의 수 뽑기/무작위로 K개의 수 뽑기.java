import java.util.LinkedHashSet;
class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            if (set.size() < k) {
                set.add(num);
            } else {
                break;
            }
        }

        int[] result = new int[k];
        int i = 0;

        for (int num : set) {
            result[i++] = num;
        }

        while (i < k) {
            result[i++] = -1;
        }

        return result;
    }
}