import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String N = Integer.toString(n);
        
        for(int i = 0; i < N.length(); i++) {
            answer += Integer.valueOf(N.charAt(i) - '0'); // 문자는 각각 유니코드 값 갖고있어서 '0'빼줌
        }
        
         // 더 효율적
         // while(true) {
         //     answer += n % 10;
         //     if (n < 10) {
         //         break;
         //     }
         //     n = n / 10;
         // }
        
        return answer;
    }
}