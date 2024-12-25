class Solution {
    public int solution(int[] numbers) {
        int total = 45;
        int sum = 0;
        
        for(int number : numbers) {
            sum += number;
        }
        
        return total - sum;
    }
}