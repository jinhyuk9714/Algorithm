import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean ok = true;
            for (char c : Integer.toString(i).toCharArray()) {
                if (c != '0' && c != '5') {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer;
    }
}