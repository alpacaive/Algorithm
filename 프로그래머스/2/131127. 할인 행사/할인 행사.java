import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;  // 연속된 10일
        Map<String, Integer> wantMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);  // 원하는 제품과 개수 저장
        }
        
        for(int i = 0; i <= discount.length - days; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            
            // 10일 동안의 제품 개수 기록
            for(int j = 0; j < days; j++) {
                discountMap.put(discount[i + j], discountMap.getOrDefault(discount[i + j], 0) + 1);
            }
            
            // 현재 10일 동안의 제품 목록이 원하는 목록과 일치하는지 확인
            if(matches(wantMap, discountMap)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean matches(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for(String key : wantMap.keySet()) {
            if(discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        
        return true;
    }
    
}