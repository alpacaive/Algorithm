class Solution { // 벽 길이 n미터, 룰러 길이 m미터
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int currentSection = 0;
        
        for(int num : section) {
            if(num > currentSection) {
                count++;
                currentSection = num + m - 1;
            }
        }
        
        return count;
    }
}