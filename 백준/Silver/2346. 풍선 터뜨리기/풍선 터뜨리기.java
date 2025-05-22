import java.io.*;
import java.util.*;

public class Main {
    static class Balloon {
        int index;
        int move;

        Balloon(int index, int move) {
            this.index = index;
            this.move = move;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<Balloon> dq = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            dq.addLast(new Balloon(i + 1, a));
        }

        while (!dq.isEmpty()) {
            Balloon now = dq.removeFirst();
            sb.append(now.index).append(" ");

            if (dq.isEmpty()) break;

            int move = now.move;
            int size = dq.size();

            if (move > 0) {
                move = (move - 1) % size;
                for (int i = 0; i < move; i++) {
                    dq.addLast(dq.removeFirst());
                }
            } else {
                move = (-move) % size;
                for (int i = 0; i < move; i++) {
                    dq.addFirst(dq.removeLast());
                }
            }
        }

        System.out.println(sb);
    }
}
