import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean isReading = false;
        StringTokenizer st;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            if (A.equals("ChongChong") || B.equals("ChongChong")) {
                isReading = true;
                set.add(A);
                set.add(B);
            }
            if (isReading && (set.contains(A) || set.contains(B))) {
                set.add(A);
                set.add(B);
            }
        }

        System.out.println(set.size());
    }
}
