import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        sb.append((int) Math.pow(2, N) - 1).append('\n');
        hanoi(N, 1, 2, 3);
        System.out.print(sb);
    }

    public static void hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            sb.append(from).append(' ').append(to).append('\n');
            return;
        }

        hanoi(n - 1, from, to, via);
        sb.append(from).append(' ').append(to).append('\n');
        hanoi(n - 1, via, from, to);
    }
}
