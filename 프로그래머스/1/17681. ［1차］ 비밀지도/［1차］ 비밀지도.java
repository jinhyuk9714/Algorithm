class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        StringBuilder sb;
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            String n1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String n2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (n1.charAt(j) == '1' || n2.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            res[i] = sb.toString();
        }
        return res;
    }
}