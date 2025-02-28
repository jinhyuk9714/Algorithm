import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] arr = new int[26]; 
        Arrays.fill(arr, -1);

        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (arr[idx] == -1) {
                ans[i] = -1;
            } else {
                ans[i] = i - arr[idx];
            }
            arr[idx] = i;
        }

        return ans;
    }
}