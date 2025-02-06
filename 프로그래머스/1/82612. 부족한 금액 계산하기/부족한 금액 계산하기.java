class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0, cur = 0;
        for (int i = 0; i < count; i++) {
            cur += price;
            answer += cur;
        }
        return answer - money >= 0 ? answer - money : 0;
    }
}