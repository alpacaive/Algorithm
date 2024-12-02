import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(sc.hasNextInt()) { // hasNextInt() => Scanner 객체의 입력값이 int 일때만 true 반환
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum = A + B;
            System.out.println(sum);
        }

    }
}