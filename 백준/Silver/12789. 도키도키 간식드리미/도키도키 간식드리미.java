import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int count = 1;

        for (int i = 0; i < N; i++) {
            int num = arr[i];
            // 스택에 있는 애들 먼저 처리
            while (!stack.isEmpty() && stack.peek() == count) {
                stack.pop();
                count++;
            }

            if (num == count) {
                count++;
            } else {
                stack.push(num);
            }
        }

        // 마지막에 남은 스택 처리
        while (!stack.isEmpty()) {
            if (stack.peek() == count) {
                stack.pop();
                count++;
            } else {
                break;
            }
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
