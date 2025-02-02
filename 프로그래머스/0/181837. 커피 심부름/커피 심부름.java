class Solution {
    public int solution(String[] order) {
        int result = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) {
                result += 5000;
            } else {
                result += 4500;
            } 
        }
        return result;
    }
}