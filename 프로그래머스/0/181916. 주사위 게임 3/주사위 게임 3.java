class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0, count = 0, sum = 0;
        int p, q;

        if (a==b){
            sum += a;
            count++;
        }
        if (a==c){
            sum += a;
            count++;
        }
        if (a==d){
            sum += a;
            count++;
        }
        if (b==c){
            sum += b;
            count++;
        }
        if (b==d){
            sum += b;
            count++;
        }
        if (c==d){
            sum += c;
            count++;
        }

        if (count == 6) {
            p = sum / 6;
            answer = 1111 * p;
        } else if (count == 3) {
            p = sum / 3;
            q = a + b + c + d - sum;
            answer = (int) Math.pow(10 * p + q, 2);
        } else if (count == 2) {
            p = sum - a;
            q = a;
            answer = (p + q) * Math.abs(p - q);
        } else if (count == 1) {
            answer = (a * b * c * d) / ((int) Math.pow(sum, 2));
        } else {
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }
        return answer;
    }
}