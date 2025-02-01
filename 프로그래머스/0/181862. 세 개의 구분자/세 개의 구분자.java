class Solution {
    public String[] solution(String myStr) {
        String[] result = myStr.replaceAll("[abc]", " ").trim().split("\\s+");

        return result[0].isEmpty() ? new String[]{"EMPTY"} : result;
    }
}