import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int len = (int) Math.pow(3, n);
            char[] arr = new char[len];

            // 모든 문자 '-'로 초기화
            for (int i = 0; i < len; i++) arr[i] = '-';

            // 칸토어 집합 만들기
            cantor(arr, 0, len);

            // 출력
            System.out.println(new String(arr));
        }
    }

    public static void cantor(char[] arr, int start, int len) {
        if (len < 3) return;

        int third = len / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }

        cantor(arr, start, third);
        cantor(arr, start + 2 * third, third);
    }
}
