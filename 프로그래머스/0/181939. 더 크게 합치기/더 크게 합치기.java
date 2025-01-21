class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c1 = Integer.toString(a) + Integer.toString(b);
        String c2 = Integer.toString(b) + Integer.toString(a);

        int i1 = Integer.parseInt(c1);
        int i2 = Integer.parseInt(c2);

        answer = (i1 > i2) ? i1 : i2;
        return answer;
    }
}