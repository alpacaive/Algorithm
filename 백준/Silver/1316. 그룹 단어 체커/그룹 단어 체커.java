import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            if (check(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check(String word) {
        boolean[] check = new boolean[26];
        char prev = ' ';

        for (int i = 0; i < word.length(); i++) {
            char now = word.charAt(i); // happy
            if (now != prev) {
                if (check[now - 'a']) {
                    return false;
                }
                check[now - 'a'] = true;
                prev = now;
            }
        }
        return true;
    }
}