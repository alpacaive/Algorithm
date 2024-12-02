import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] a = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String word = sc.next();
            if (word.length() > max) {
                max = word.length();
            }
            for (int j = 0; j < word.length(); j++) {
                a[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[j][i] == '\0') {
                    continue;
                }
                System.out.print(a[j][i]);
            }
        }

    }
}
