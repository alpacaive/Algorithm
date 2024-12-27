import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> result = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        int[] answer = new int[result.size()];
        int index = 0;

        for (Integer i : result) {
            answer[index++] = i;
        }

        return answer;
    }
}