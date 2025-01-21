class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        int i = -1;

        for (Character b : code.toCharArray()) {
            i++;
            if (b == '1') {
                mode = !mode;
                continue;
            }
            if (!mode && i % 2 == 0) {
                answer += b;
            } else if (mode && i % 2 != 0) {
                answer += b;
            }
        }

        if (answer.isEmpty()) {
            answer = "EMPTY";
        }
        return answer;
    }
}