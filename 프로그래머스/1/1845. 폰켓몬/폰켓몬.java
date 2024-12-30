import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }
        
        System.out.print(set);
        
        return set.size() > answer ? answer : set.size();
    }
}