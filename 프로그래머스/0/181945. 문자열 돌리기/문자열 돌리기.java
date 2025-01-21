import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (Character b : a.toCharArray()) {
            answer += b + "\n";
        }

        System.out.println(answer);
    }
}