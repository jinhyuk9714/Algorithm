import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor != 0) {
                arr[i] = 0;
                idx++;
            }
        }
        Arrays.sort(arr);
        return idx != arr.length ? Arrays.copyOfRange(arr, idx, arr.length) : new int[]{-1};
    }
}