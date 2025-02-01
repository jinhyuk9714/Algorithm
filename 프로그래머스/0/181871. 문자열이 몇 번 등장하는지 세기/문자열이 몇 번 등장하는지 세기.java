class Solution {
    public int solution(String myString, String pat) {
        int count = 0, temp = -1;
        while (true) {
            temp = myString.indexOf(pat, temp + 1);
            if (temp == -1) {
                break;
            }
            count++;
        }
        return count;
    }
}