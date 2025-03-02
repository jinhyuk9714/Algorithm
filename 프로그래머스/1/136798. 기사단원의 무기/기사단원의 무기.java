class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;

        for (int i = 1; i <= number; i++) {
            int count = getDivisorsCount(i);
            if (count <= limit) {
                result += count;
            } else {
                result += power;
            }
        }

        return result;
    }

    private int getDivisorsCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count += (i * i == n) ? 1 : 2;
            }
        }
        return count;
    }
}