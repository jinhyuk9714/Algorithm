class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        String s1 = s.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'p') {
                p++;
            } else if (s1.charAt(i) == 'y') {
                y++;
            }
        }

        return p == y;
    }
}