import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        myString = myString.replace("x", " ");
        String[] answer = myString.trim().split("\\s+");
        Arrays.sort(answer);
        return answer;
    }
}