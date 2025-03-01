class Solution {
    public int solution(int a, int b, int n) {
        int res = 0;
        while (n >= a) {
            res += (n / a) * b;
            n = (n / a) * b + n % a;
        }
        return res;
    }
}