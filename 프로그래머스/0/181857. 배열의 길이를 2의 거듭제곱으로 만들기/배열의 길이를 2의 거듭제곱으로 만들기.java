class Solution {
    public int[] solution(int[] arr) {
        int sq = 0;
        while (Math.pow(2, sq) < arr.length) {
            sq++;
        }
        int len = (int) Math.pow(2, sq);
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < arr.length) {
                result[i] = arr[i];
            } else {
                result[i] = 0;
            } 
        }
        return result;
    }
}