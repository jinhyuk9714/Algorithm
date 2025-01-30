class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char i : my_string.toCharArray()) {
            if (Integer.valueOf(i) >= 97) {
                answer[Integer.valueOf(i) - 71]++;
            } else {
                answer[Integer.valueOf(i) - 65]++;
            }
        }
        return answer;
    }
}