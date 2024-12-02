import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < N; i++) {
            if (a[i] < min) {
                min = a[i];
            } 
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);


    }
}