import java.io.*;
import java.util.*;

public class Main {
    static int rec_count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            rec_count = 0;
            String s = br.readLine();
            sb.append(isPalindrome(s)).append(" ").append(rec_count).append("\n");
        }


        System.out.println(sb);
    }

    public static int recursion(String s, int l, int r) {
        rec_count++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}
