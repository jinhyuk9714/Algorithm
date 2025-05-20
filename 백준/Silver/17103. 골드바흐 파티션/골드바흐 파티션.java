import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] isNotPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int count;
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            isNotPrime = new boolean[N + 1];
            sieveOfEratosthenes(N);
            count = 0;
            for (int j = 2; j <= N / 2; j++) {
                int k = N - j;
                if (!isNotPrime[j] && !isNotPrime[k]) {
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
