import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            S = sc.next();
            int last = S.length();
            System.out.println(S.substring(0, 1) + S.substring(last-1, last));
        }

    }
}