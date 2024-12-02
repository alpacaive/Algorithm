import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double avr = 0; // 이수학점 * 성적
        double sumCredits = 0; // 총 이수학점

        for (int i = 1; i <= 20; i++) {
            String name = sc.next(); // 과목명
            double credit = sc.nextDouble(); // 이수학점
            String result = sc.next(); // 성적

            if (result.equals("A+")) {
                avr += credit * 4.5;
                sumCredits += credit;
            } else if (result.equals("A0")) {
                avr += credit * 4.0;
                sumCredits += credit;
            } else if (result.equals("B+")) {
                avr += credit * 3.5;
                sumCredits += credit;
            } else if (result.equals("B0")) {
                avr += credit * 3.0;
                sumCredits += credit;
            } else if (result.equals("C+")) {
                avr += credit * 2.5;
                sumCredits += credit;
            } else if (result.equals("C0")) {
                avr += credit * 2.0;
                sumCredits += credit;
            } else if (result.equals("D+")) {
                avr += credit * 1.5;
                sumCredits += credit;
            } else if (result.equals("D0")) {
                avr += credit * 1.0;
                sumCredits += credit;
            } else if (result.equals("F")) {
                avr += credit * 0.0;
                sumCredits += credit;
            }

        }
        System.out.printf("%.6f", avr/sumCredits);
    }
}