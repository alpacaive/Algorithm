import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int count = 0;
        
        for(int i = 0; i < t.length() - len + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + len));
            if(diff <= num) {
                count++;
            }
        }
        
        return count;
    }
}