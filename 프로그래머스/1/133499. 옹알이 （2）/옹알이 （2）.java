class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "0")
                                     .replaceAll("ye", "1")
                                     .replaceAll("woo", "2")
                                     .replaceAll("ma", "3");

            // 변환된 문자열이 숫자로만 이루어져 있는지 확인
            if (!babbling[i].matches("^[0123]+$")) {
                continue;
            }

            // 연속된 숫자가 있는지 확인
            if (babbling[i].matches(".*(00|11|22|33).*")) {
                continue;
            }

            result++;
        }
        return result;
    }
}
