class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] list = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            list[i] = my_string.charAt(i);
        }
        for (int i = 0; i < index_list.length; i++) {
            answer += list[index_list[i]];
        }
        return answer;
    }
}