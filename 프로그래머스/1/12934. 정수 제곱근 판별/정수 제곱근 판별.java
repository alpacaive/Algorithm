class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        
        if(sqrt == (long)sqrt) {
            return (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
        
        return -1;
    }
}