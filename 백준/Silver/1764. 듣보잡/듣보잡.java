import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            set.add(st.nextToken());
        }

        Set<String> treeSet = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (set.contains(s)) {
                treeSet.add(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(treeSet.size()).append('\n');
        for (String s : treeSet) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
