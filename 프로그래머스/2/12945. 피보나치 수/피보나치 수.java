class Solution {
    public int solution(int n) {
        int MOD = 1234567;  // 나눠야 할 값
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int a = 0;  // F(0) = 0
        int b = 1;  // F(1) = 1
        
        for(int i = 2; i <= n; i++) {
            int temp = (a + b) % MOD;  // F(n) = (F(n-1) + F(n-2)) % MOD
            a = b;  // 이전 값 업데이트 (F(n-2) -> F(n-1))
            b = temp;
        }
        
        return b;
    }
}