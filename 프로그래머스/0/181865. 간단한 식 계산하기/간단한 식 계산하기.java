class Solution {
    public int solution(String binomial) {
        String[] list = binomial.split(" ");
        int a = Integer.parseInt(list[0]), b = Integer.parseInt(list[2]);
        switch (list[1]) {
            case "+" -> {
                return a + b;
            } case "-" -> {
                return a - b;
            } case "*" -> {
                return a * b;
            }
        }
        return 0;
    }
}