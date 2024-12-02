import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String[] c = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < c.length; i++) {
            word = word.replace(c[i], "*");

        }

        System.out.println(word.length());

    }
}