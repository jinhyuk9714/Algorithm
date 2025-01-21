import java.util.Objects;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (Objects.equals(ineq, "<")) {
            if (Objects.equals(eq, "=")) {
                answer = (n <= m) ? 1 : 0;
            } else {
                answer = (n < m) ? 1 : 0;
            }
        } else {
            if (Objects.equals(eq, "=")) {
                answer = (n >= m) ? 1 : 0;
            } else {
                answer = (n > m) ? 1 : 0;
            }
        }
        return answer;
    }
}