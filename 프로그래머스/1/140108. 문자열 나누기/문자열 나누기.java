class Solution {
    public int solution(String s) {
        int answer = 0;
        // 현재 문자의 개수를 기록하는 변수
        int cnt = 1;
        // 이전 문자를 기록하는 변수
        char prevChar = s.charAt(0);
        
        for(int i = 1; i < s.length(); i++) {
            // 현재 문자
            char currentChar = s.charAt(i);
            
            // cnt가 0이면 새롭게 나눌 문자열 세팅
            if(cnt == 0) {
                prevChar = currentChar;
                cnt++;
                continue;
            }
            
            if(prevChar == currentChar) {
                cnt++;
            } else {
                cnt--;
            }
            
            // 문자열이 나눠진 경우
            if(cnt == 0) {
                answer++;
            }
        }
        
        // 남는 문자가 존재하는 경우 answer 증가
        if(cnt != 0) {
            answer++;
        }
        
        return answer;
    }
}