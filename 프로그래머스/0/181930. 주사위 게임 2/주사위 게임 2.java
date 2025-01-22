class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int p = (a == b && b == c) ? 3 : (a == b || a == c || b == c) ? 2 : 1;
        for (int i = 1; i <= p; i++) {
            answer *= (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }
        return answer;
    }
}