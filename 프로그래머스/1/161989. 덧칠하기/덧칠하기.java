class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = 0; // 마지막으로 롤러로 칠한 구역

        for (int s : section) {
            if (s > lastPainted) { // 현재 구역이 마지막으로 칠한 곳보다 크다면 새로운 롤러 사용
                lastPainted = s + m - 1; // 롤러를 사용하여 s부터 m칸 덮음
                answer++; // 롤러 사용 횟수 증가
            }
        }

        return answer;
    }
}