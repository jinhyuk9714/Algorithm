class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        answer += included[0] ? a : 0;
        for (int i = 1; i < included.length; i++) {
            a += d;
            answer += included[i] ? a : 0;
        }
        return answer;
    }
}