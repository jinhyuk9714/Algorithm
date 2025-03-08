import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] result = new int[N + 1];

        // 각 스테이지별 도달한 유저 수 계산
        for (int stage : stages) {
            if (stage <= N) {
                result[stage - 1]++;
            }
        }

        // 실패율 계산
        Map<Integer, Double> map = new HashMap<>();
        int users = stages.length;

        for (int i = 0; i < N; i++) {
            if (users > 0) {
                map.put(i + 1, (double) result[i] / users); // 실패율 저장
                users -= result[i]; // 다음 스테이지로 넘어가는 유저 수 감소
            } else {
                map.put(i + 1, 0.0); // 남은 유저가 없으면 실패율 0
            }
        }

        // 실패율 기준으로 내림차순 정렬, 실패율이 같다면 스테이지 번호 오름차순 정렬
        List<Map.Entry<Integer, Double>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((a, b) -> {
            if (b.getValue().compareTo(a.getValue()) == 0) {
                return a.getKey().compareTo(b.getKey()); // 실패율이 같다면 스테이지 번호 오름차순
            }
            return b.getValue().compareTo(a.getValue()); // 실패율 내림차순
        });

        // 정렬된 키(스테이지 번호)만 배열로 변환
        return sortedList.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}