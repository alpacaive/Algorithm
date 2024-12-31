import java.util.*;

class Solution { // k = 최대점수, m = 한 상자에 들어가는 사과의 수, score = 사과 점수 
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score); // 1 1 1 2 2 3 3 
                            // 1 1 2 2 2 2 4 4 4 4 4 4
        
        // 7-4=3   3-4=-1
        // 12-3=9   9-3=6   6-3=3   3-3=0
        for(int i = score.length - m; i >= 0; i-=m) {
            answer += m*(score[i]);
        }
        
        return answer;
    }
}