import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int[] len = new int[30];
        for (String s : strArr) {
            len[s.length() - 1]++;
        }
        Arrays.sort(len);
        return len[29];
    }
}