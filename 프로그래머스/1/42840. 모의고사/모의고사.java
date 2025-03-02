import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int score1 = 0, score2 = 0, score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (arr1[i % arr1.length] == answers[i]) {
                score1++;
            }
            if (arr2[i % arr2.length] == answers[i]) {
                score2++;
            }
            if (arr3[i % arr3.length] == answers[i]) {
                score3++;
            }
        }

        int maxScore = Math.max(Math.max(score1, score2), score3);
        ArrayList<Integer> list = new ArrayList<>();
        if (score1 == maxScore) {
            list.add(1);
        }
        if (score2 == maxScore) {
            list.add(2);
        }
        if (score3 == maxScore) {
            list.add(3);
        }
        return list.stream().mapToInt(i -> i).toArray();

    }
}