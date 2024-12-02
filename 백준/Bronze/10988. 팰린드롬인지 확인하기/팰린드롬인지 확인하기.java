import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder(S);
        String R = sb.reverse().toString();

        if (S.equals(R)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}