class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int i1 = Integer.parseInt("" + a + b);
        int i2 = 2 * a * b;

        answer = (i1 >= i2) ? i1 : i2;
        return answer;
    }
}