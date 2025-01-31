class Solution {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.lastIndexOf(pat) + pat.length(); i++) {
            sb.append(myString.charAt(i));
        }
        return sb.toString();
    }
}