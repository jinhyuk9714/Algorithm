class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int max = 1000001;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] < arr[j] && arr[j] <= max) {
                    max = arr[j];
                }
            }
            answer[i] = max != 1000001 ? max : -1;
        }
        return answer;
    }
}