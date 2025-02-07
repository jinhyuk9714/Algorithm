class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                sb.append(j % 2 == 0 ? Character.toUpperCase(arr[i].charAt(j)) : Character.toLowerCase(arr[i].charAt(j)));
            }
            if (i < arr.length - 1) sb.append(" ");
        }

        return sb.toString();
    }
}