import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> rank = new ArrayList<>();
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            Collections.sort(rank);
            if (i < k - 1) {
                result[i] = rank.get(0);
            } else {
                result[i] = rank.get(rank.size() - k);
            }
        }
        return result;
    }
}