import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if (s2.equals("enter")) {
                set.add(s1);
            } else {
                set.remove(s1);
            }
        }

        NavigableSet<String> reverseSet = set.descendingSet();
        for (String s : reverseSet) {
            System.out.println(s);
        }
    }
}
