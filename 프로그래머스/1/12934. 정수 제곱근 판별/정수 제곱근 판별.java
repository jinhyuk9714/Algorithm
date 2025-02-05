class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if (sqrt % 1 == 0) {
            long next = (long) sqrt + 1;
            return next * next;
        }

        return -1;
    }
}