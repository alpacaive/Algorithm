class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int removeCnt = 0;
        
        while(!s.equals("1")) {
            int oneCnt = 0;
            
            for(char c : s.toCharArray()) {
                if(c == '1') {
                    oneCnt++;
                } else {
                    removeCnt++;
                }
            }
            
            s = Integer.toBinaryString(oneCnt);
            cnt++;
        }
        
        return new int[] {cnt, removeCnt};
    }
}