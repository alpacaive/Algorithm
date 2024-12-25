class Solution {
    public boolean solution(int x) {
        int answer = 0;
        char[] c = String.valueOf(x).toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            answer += c[i] - '0';
        }
        System.out.println(answer);
        
        if(x%answer == 0) {
            return true;
        } else {
            return false;
        }
        
    }
}