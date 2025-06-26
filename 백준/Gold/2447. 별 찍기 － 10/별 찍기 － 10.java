import java.io.*;

public class Main {
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new char[N][N];
        fillStar(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (char[] row : map) {
            for (char c : row) {
                sb.append(c);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    // (x, y): 현재 블록의 좌상단 좌표
    // size: 현재 블록의 크기
    // blank: 현재 블록이 공백으로 채워져야 하는지 여부
    public static void fillStar(int x, int y, int size, boolean blank) {
        if (blank) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    map[i][j] = ' ';
                }
            }
            return;
        }

        if (size == 1) {
            map[x][y] = '*';
            return;
        }

        int newSize = size / 3;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count++;
                // 가운데 부분만 공백으로
                boolean nextBlank = (count == 5);
                fillStar(x + i * newSize, y + j * newSize, newSize, nextBlank);
            }
        }
    }
}
