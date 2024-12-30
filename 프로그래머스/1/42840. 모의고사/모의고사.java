import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] result = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i%5]) {
                result[0]++;
            }
            if(answers[i] == second[i%8]) {
                result[1]++;
            }
            if(answers[i] == third[i%10]) {
                result[2]++;
            }
        }
        
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++) {
            if(max == result[i]) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}