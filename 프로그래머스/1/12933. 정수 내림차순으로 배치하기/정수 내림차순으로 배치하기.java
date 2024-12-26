import java.util.*;

class Solution {
    public long solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        
        StringBuilder sb = new StringBuilder(new String(c));
        sb.reverse();
                
        return Long.parseLong(sb.toString());
    }
}