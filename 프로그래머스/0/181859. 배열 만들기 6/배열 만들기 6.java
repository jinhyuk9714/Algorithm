import java.util.Stack;
class Solution {
    public int[] solution(int[] arr)  {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.empty()) {
                stk.push(arr[i]);
            } else if (stk.peek() == arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(i -> i).toArray();
    }
}