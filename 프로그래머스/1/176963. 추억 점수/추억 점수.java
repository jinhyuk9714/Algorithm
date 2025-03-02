import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        int[] result = new int[photos.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photos.length; i++) {
            for (int j = 0; j < photos[i].length; j++) {
                if(map.containsKey(photos[i][j])){
                    result[i] += map.get(photos[i][j]);
                }
            }
        }
        return result;
    }
}