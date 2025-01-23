class Solution {
    public int solution(int n, String control) {
        for (char i : control.toCharArray()) {
            switch (i) {
                case 'w' -> {
                    n++;
                }
                case 's' -> {
                    n--;
                }
                case 'd' -> {
                    n += 10;
                }
                case 'a' -> {
                    n -= 10;
                }
            }
        }
        return n;
    }
}