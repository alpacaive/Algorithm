class Solution {
    public String solution(int[] food) {        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < food.length; i++ ) {
            int quantity = food[i] / 2;
            sb.append(String.valueOf(i).repeat(quantity));
        }
        
        String answer = sb + "0";
        
        answer += sb.reverse();
        
        return answer;
    }
}