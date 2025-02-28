class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                sb.append((char) ('A' + (ch - 'A' + n) % 26));
            } else if (Character.isLowerCase(ch)) {
                sb.append((char) ('a' + (ch - 'a' + n) % 26));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
