import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (Character b : a.toCharArray()) {
            if (Character.isUpperCase(b)) {
                answer += Character.toLowerCase(b);
            } else {
                answer += Character.toUpperCase(b);
            }
        }
        System.out.println(answer);
    }
}