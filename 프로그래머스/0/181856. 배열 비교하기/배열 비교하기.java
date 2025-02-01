class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int s1 = 0, s2 = 0;
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                s1 += arr1[i];
                s2 += arr2[i];
            }
        }
        return Integer.compare(s1, s2);
    }
}