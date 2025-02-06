class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(String a : arr) {
            int value = Integer.parseInt(a);
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        
        return min + " " + max;
    }
}