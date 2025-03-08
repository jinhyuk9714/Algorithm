class Solution {
    public int solution(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                res++;
            }
        }
        return res;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}