import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고
//        , 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
//        도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고
//        , 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
//        바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음
//        , 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 바구니 바꾸는 횟수
        int temp = 0;

        int[] arr = new int[N];
        for (int a = 0; a < N; a++) {
            arr[a] = a + 1;
        }

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while(i < j) {
                temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        
        for (int a = 0; a < N; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}