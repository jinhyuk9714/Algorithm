import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] part1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] part2 = Arrays.copyOfRange(num_list, 0, n);

        int[] result = new int[part1.length + part2.length];

        System.arraycopy(part1, 0, result, 0, part1.length);
        System.arraycopy(part2, 0, result, part1.length, part2.length);

        return result;
    }
}