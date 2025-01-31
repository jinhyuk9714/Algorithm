import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<String> solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return new ArrayList<>(Arrays.asList(Arrays.copyOfRange(str_list, 0, i)));
            } else if (str_list[i].equals("r")) {
                return new ArrayList<>(Arrays.asList(Arrays.copyOfRange(str_list, i + 1, str_list.length)));
            }
        }
        return new ArrayList<>();
    }
}