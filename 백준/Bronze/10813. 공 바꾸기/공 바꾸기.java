import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 몇번 공의 바꿀지

        int[] ball = new int[N];
        int temp = 0;

        for (int i = 0; i < N; i++) {
            ball[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = ball[I - 1];
            ball[I - 1] = ball[J - 1];
            ball[J - 1] = temp;
        }

        for (int k = 0; k < N; k++) {
            System.out.print(ball[k] + " ");
        }

    }
}