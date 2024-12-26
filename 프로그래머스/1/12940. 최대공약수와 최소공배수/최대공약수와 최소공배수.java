class Solution {
    public int[] solution(int n, int m) {
        int[] result = new int[2];
        int max = 0;
        
        for(int i = 1; i <= n && i <= m; i++) {
            if(n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        
        result[0] = max;
        result[1] = n * m / max;
        
        return result;
    }
}