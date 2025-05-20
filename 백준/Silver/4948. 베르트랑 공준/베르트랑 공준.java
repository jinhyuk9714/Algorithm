import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] isNotPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) break;

            isNotPrime = new boolean[2 * N + 1];
            sieveOfEratosthenes(N);

            count = 0;
            for (int i = N + 1; i <= 2 * N; i++) {
                if (!isNotPrime[i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }

    public static void sieveOfEratosthenes(int n) {
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        int limit = isNotPrime.length - 1;

        for (int i = 2; i * i <= limit; i++) {
            if (isNotPrime[i]) continue;
            for (int j = i * i; j <= limit; j += i) {
                isNotPrime[j] = true;
            }
        }
    }
}
