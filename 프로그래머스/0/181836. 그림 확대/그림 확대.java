class Solution {
    public String[] solution(String[] picture, int k) {
        int idx = 0;
        String[] answer = new String[picture.length * k];
        for (String s : picture) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < k; j++) {
                    sb.append(s.charAt(i));
                }
            }
            for (int i = 0; i < k; i++) {
                answer[idx++] = sb.toString();
            }
        }
        return answer;
    }
}