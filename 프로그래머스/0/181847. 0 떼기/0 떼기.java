class Solution {
    public String solution(String n_str) {
        String str = "";
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                str = n_str.substring(i);
                break;
            }
        }
        return str;
    }
}