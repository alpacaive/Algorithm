import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C,
        // 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
        
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        
        if (100 >= score && score >= 90) {
            System.out.println("A");
        } else if (89 >= score && score >= 80) {
            System.out.println("B");
        } else if (79 >= score && score >= 70) {
            System.out.println("C");
        } else if (69 >= score && score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}