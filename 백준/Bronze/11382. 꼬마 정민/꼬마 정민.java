import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long[] list = new long[3];

        for(int i = 0; i < 3; i++) {
            list[i] = s.nextLong();
        }

        System.out.println(list[0] + list[1] + list[2]);
        s.close();
    }
}