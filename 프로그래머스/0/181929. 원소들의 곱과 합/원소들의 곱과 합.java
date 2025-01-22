class Solution {
    public int solution(int[] num_list) {
        int m = 1;
        int sp = 0;
        for (int i = 0; i < num_list.length; i++) {
            m *= num_list[i];
            sp += num_list[i];
        }
        return (m < sp * sp) ? 1 : 0;
    }
}