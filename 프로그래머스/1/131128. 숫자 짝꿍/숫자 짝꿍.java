import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        char[] ch_x = X.toCharArray();
        char[] ch_y = Y.toCharArray();
        
        Arrays.sort(ch_x);
        Arrays.sort(ch_y);
        
        int idx_x = ch_x.length - 1;
        int idx_y = ch_y.length - 1;
        
        while(idx_x >= 0 && idx_y >= 0) {
            if(ch_x[idx_x] == ch_y[idx_y]) {
                answer.append(ch_x[idx_x]);
                idx_x--;
                idx_y--;
            } else if(ch_x[idx_x] > ch_y[idx_y]) {
                idx_x--;
            } else {
                idx_y--;
            }
        }
        
        if(answer.length() == 0) {
            return "-1";
        }
        
        if(answer.toString().matches("0+")) {
            return "0";
        }
        
        return answer.toString();
    }
}