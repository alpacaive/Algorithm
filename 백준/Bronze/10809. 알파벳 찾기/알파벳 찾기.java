import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int[] position = new int[26];
        for (int i = 0; i < 26; i++) {
            position[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a';;
            if (position[index] == -1) {
                position[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(position[i] + " ");
        }
        
    }
}