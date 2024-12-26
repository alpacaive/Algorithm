class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        char[] ch = s.toCharArray();
        
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] > '9' || ch[i] < '0') {
                return false;
            }
        }
        
        return true;
    }
}