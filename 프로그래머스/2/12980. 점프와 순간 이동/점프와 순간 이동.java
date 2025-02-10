import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            if(n % 2 == 1) {  // 훌수면 1칸 점프(건전지 사용)
                answer++;
            }
            
            n /= 2;
        }
        
        return answer;
    }
}