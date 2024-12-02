import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean flag = true;
        
        while(flag) {
            
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum = A + B;
            if (A == 0 && B == 0) {
                flag = false;
                break;
            }
            System.out.println(sum);
        }
    }
}