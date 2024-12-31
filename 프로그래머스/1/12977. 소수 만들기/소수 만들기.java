import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        int max = Collections.max(list);
        
        boolean[] isPrime = Eratosthenes(max);
        
        for(int num : list) {
            if(isPrime[num]) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean[] Eratosthenes(int max) {
        boolean[] isPrime = new boolean[max+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i * i <= max; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                } 
            }
        }
        
        return isPrime;
    }
}