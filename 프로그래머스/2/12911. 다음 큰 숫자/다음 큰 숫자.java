class Solution {
    public int solution(int n) {
        char[] charArray = Integer.toBinaryString(n).toCharArray();
        int oneCnt = 0;
        int result = 0;
        boolean flag = true;
        
        for(char c : charArray) {
            if(c == '1') {
                oneCnt++;
            }
        }
        
        while(flag) {
            int nextOneCnt = 0;
            n++;
            char[] nextCharArray = Integer.toBinaryString(n).toCharArray();
            
            for(char c : nextCharArray) {
                if(c == '1') {
                    nextOneCnt++;
                }
            }
            
            if(nextOneCnt == oneCnt) {
                result = n;
                flag = false;
            }
        }
        
        return result;
    }
}