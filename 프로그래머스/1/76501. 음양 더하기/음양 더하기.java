class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int idx = 0, answer = 0;
        for (int absolute : absolutes) {
            if (signs[idx]) {
                answer += absolute;
            } else {
                answer -= absolute;
            }
            idx++;
        }
        return answer;
    }
}