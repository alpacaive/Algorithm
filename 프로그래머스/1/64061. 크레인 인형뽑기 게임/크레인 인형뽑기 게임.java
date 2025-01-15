import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int length = board[0].length;
        Stack<Integer> stack = new Stack<>();
        
        for(int mv : moves) {
            mv -= 1;
            for(int i = 0; i < length; i++) {
                if(board[i][mv] != 0) { // 인형 집을 위치에 인형이 있는 경우 board[mv][i]
                    if(stack.size() > 0 && stack.peek() == board[i][mv]) { // 지금 뽑은 인형과 마지막 인형이 같다면
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][mv]);
                    }
                    board[i][mv] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}