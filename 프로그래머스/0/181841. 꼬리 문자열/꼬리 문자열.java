class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder result = new StringBuilder();
        for (String s : str_list) {
            result.append(s.contains(ex) ? "" : s);
        }
        return result.toString();
    }
}