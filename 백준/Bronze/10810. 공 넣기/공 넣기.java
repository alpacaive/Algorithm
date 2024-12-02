import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 넣을 바구니 번호

        int[] ball = new int[N];

        for(int a = 0; a < M; a++) {
            int i = sc.nextInt(); // 시작 바구니 번호
            int j = sc.nextInt(); // 끝 바구니 번호
            int k = sc.nextInt(); // 넣을 공 번호

            for(int b = i-1; b < j; b++) {
                ball[b] = k;
            }
        }

        for(int b = 0; b < N; b++) {
            System.out.print(ball[b] + " ");
        }

    }
}