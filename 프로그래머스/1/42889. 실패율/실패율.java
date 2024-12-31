import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        int[] userFailCnt = new int[N+2];
        int[] userTotalCnt = new int[N+1];
        
        // 스테이지 별 머물러있는 사용자 수 카운트
        for(int stage : stages) {
            userFailCnt[stage]++;
        }
        
        // 스테이지 별 도달한 플레이어 수 카운트
        userTotalCnt[N] = userFailCnt[N] + userFailCnt[N+1];
        for(int i = N-1; i >= 1; i--) {
            userTotalCnt[i] = userFailCnt[i] + userTotalCnt[i+1];
        }
        
        // 스테이지 별 실패율 계산
        for(int i = 1; i < userTotalCnt.length; i++) {
            if(userFailCnt[i] == 0 || userTotalCnt[i] == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double)userFailCnt[i] / userTotalCnt[i]);
            }
        }
        
        // 실패율(value) 값으로 스테이지(key)를 내림차순 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}