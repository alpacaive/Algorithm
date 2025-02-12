import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        int sum = 0;
        int cnt = 0;
        for(int a : list) {
            sum += a;
            cnt++;
            if(sum >= k) {
                break;
            }
        }
        
        return cnt;
    }
}