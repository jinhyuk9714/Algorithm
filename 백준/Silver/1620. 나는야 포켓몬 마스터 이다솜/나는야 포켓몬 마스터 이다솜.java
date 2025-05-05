import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 양방향 맵 (실무에서 자주 씀)
        Map<String, Integer> strToNum = new HashMap<>();
        Map<Integer, String> numToStr = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            strToNum.put(s, i);
            numToStr.put(i, s);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (input.matches("-?\\d+")) {
                int number = Integer.parseInt(input);
                sb.append(numToStr.get(number));
            } else {
                sb.append(strToNum.get(input));
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
