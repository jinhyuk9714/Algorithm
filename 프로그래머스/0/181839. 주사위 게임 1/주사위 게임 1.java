class Solution {
    public int solution(int a, int b) {
        return (a * b % 2 != 0) ? a * a + b * b : (a + b) % 2 != 0 ? 2 * (a + b) : a - b > 0 ? a - b : -(a - b);
    }
}