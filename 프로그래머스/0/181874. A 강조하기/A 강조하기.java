class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a' || myString.charAt(i) == 'A') {
                sb.append(Character.toUpperCase(myString.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(myString.charAt(i)));
            }
        }
        return sb.toString();
    }
}