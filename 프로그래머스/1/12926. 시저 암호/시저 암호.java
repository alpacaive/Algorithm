class Solution {
    public String solution(String s, int n) {
        char[] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') {
                continue;
            }
            
            if('A' <= c[i] && c[i] <= 'Z') {
                c[i] = (char)((c[i] - 'A' + n) % 26 + 'A');
            } else if('a' <= c[i] && c[i] <= 'z') {
                c[i] = (char)((c[i] - 'a' + n) % 26 + 'a');
            }   
        }
        
        
        return new String(c);
    }
}