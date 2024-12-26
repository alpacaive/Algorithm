class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;
        
        for(int i = 1; i <= count; i++) {
            cost += price * i;
        }
        
        if(cost > money) {
            return cost - money;
        } else {
            return 0;
        }
        
    }
}