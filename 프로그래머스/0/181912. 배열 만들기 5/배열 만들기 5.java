import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            int a = Integer.parseInt(str.substring(s, s + l));
            if (a > k) {
                answer.add(a);
            }
        }
        return answer;
    }
}