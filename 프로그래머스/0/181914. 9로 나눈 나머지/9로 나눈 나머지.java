class Solution {
    public int solution(String number) {
        int answer = 0;
        for (char i : number.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(i));
        }
        return answer % 9;
    }
}