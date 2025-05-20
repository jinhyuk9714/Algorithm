import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch (a) {
                case 1:
                    q.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    q.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (!q.isEmpty()) {
                        sb.append(q.pollFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 4:
                    if (!q.isEmpty()) {
                        sb.append(q.pollLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 5:
                    sb.append(q.size()).append("\n");
                    break;
                case 6:
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    if (!q.isEmpty()) {
                        sb.append(q.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 8:
                    if (!q.isEmpty()) {
                        sb.append(q.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.print(sb);
    }
}
