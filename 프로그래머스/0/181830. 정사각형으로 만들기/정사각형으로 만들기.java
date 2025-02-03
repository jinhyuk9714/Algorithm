class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr[0].length;
        int col = arr.length;

        int len = row > col ? row : col;

        int[][] arr1 = new int[len][len];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr1[i][j] = arr[i][j];
            }
        }
        return arr1;
    }
}