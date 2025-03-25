import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        int N = speeds.length;
        
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < N ; i ++){
            int spareProgressVol = 100 - progresses[i];
            int spareTime = spareProgressVol / speeds[i];
            
            int res = spareTime;
            
            if(spareProgressVol % speeds[i] != 0) res += 1;
            
            q.offer(res);
        }
        
        int cnt = 0;
        int lastIdx = q.peek();
        
        while(!q.isEmpty()){
            if(lastIdx >= q.peek()){
                cnt ++;
                q.poll();                
            } else {
                list.add(cnt);
                lastIdx = q.poll();
                cnt = 1;
            }
        }
        
        list.add(cnt);
        
        return list;
    }
}