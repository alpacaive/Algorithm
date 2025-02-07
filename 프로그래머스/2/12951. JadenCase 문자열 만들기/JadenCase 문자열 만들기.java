class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                check = true;
                sb.append(c);
            } else {
                if(check) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                check = false;
            }
        }
        
        return sb.toString();
    }
}