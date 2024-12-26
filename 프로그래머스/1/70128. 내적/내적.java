class Solution {
    public int solution(int[] a, int[] b) {
        int length = 0;
        if(a.length > b.length) {
            length = a.length;
        } else {
            length = b.length;
        }
        
        int answer = 0;
        
        for(int i = 0; i < length; i++ ) {
            answer += a[i] * b[i];
        }
        
        return answer;
        
    }
}