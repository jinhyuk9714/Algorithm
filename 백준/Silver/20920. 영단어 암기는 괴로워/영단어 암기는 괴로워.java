import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> words = new ArrayList<>(wordCount.keySet());

        // 정렬 기준 구현
        words.sort((w1, w2) -> {
            int freq1 = wordCount.get(w1);
            int freq2 = wordCount.get(w2);
            if (freq1 != freq2) {
                return freq2 - freq1; // 빈도 내림차순
            } else if (w1.length() != w2.length()) {
                return w2.length() - w1.length(); // 길이 내림차순
            } else {
                return w1.compareTo(w2); // 사전 오름차순
            }
        });

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String word : words) {
            bw.write(word);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
