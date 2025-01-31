import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        int end = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] == 2) {
                end = i;
            }
        }
        if (start == 0 && end == 0) {
            return new int[]{-1};
        }
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}