class Solution {
    public long[] solution(int x, int n) {
        if(n <= 0) {
            return new long[0];
        }
        
        long[] answer = new long[n];
        
        
        for(int i = 0; i < n; i++) {
            answer[i] = (long)x * (i+1);
        }
        
        return answer;
    }
}