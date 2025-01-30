import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int[] interval : intervals) {
            int a = interval[0], b = interval[1];
            for (int i = a; i <= b; i++) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}