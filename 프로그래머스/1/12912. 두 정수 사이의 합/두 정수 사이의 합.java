class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int a1 = Math.max(a, b);
        int b1 = Math.min(a, b);

        answer = (long) (a1 - b1 + 1) * (a1 + b1) / 2;

        return answer;
    }
}