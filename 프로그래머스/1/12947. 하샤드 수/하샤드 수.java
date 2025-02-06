class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String str = Integer.toString(x);
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return x % sum == 0;
    }
}