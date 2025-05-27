import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ave = 0;
        int[] arr = new int[N];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            ave += a;
            arr[i] = a;
            max = Math.max(max, a);
            min = Math.min(min, a);
            frequencyMap.put(a, frequencyMap.getOrDefault(a, 0) + 1);
        }

        // 최빈값들 구하기
        int maxCount = Collections.max(frequencyMap.values());
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modes.add(entry.getKey());
            }
        }
        Collections.sort(modes);

        int mode;
        if (modes.size() >= 2) {
            mode = modes.get(1);  // 두 번째로 작은 최빈값
        } else {
            mode = modes.get(0);  // 최빈값이 하나뿐일 경우
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(Math.round((float) ave / N)).append("\n");  // 평균
        sb.append(arr[N / 2]).append("\n");                   // 중앙값
        sb.append(mode).append("\n");                         // 최빈값
        sb.append(max - min);                                 // 범위

        System.out.print(sb);
    }
}
