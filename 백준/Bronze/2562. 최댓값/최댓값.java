import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];

        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int index = 1;

        for (int i = 0; i < 9; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);


    }
}