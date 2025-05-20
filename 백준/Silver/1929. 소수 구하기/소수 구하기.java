import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] isNotPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        isNotPrime = new boolean[N + 1];
        sieveOfEratosthenes(N);

        for (int i = M; i <= N; i++) {
            if (!isNotPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void sieveOfEratosthenes(int n) {
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (isNotPrime[i]) continue;

            for (int j = i * i; j <= n; j += i) {
                isNotPrime[j] = true;
            }
        }
    }
}
