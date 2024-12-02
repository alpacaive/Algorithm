import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

        // 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다
        // 첫째 줄에 게임의 상금을 출력 한다.

        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();
        int price = 0;

        if (first == second && second == third) {
            price = 10000 + (first * 1000);
        } else if (first == second || first == third) {
            price = 1000 + (first * 100);
        } else if (second == third) {
            price = 1000 + (second * 100);
        } else if ((first != second) && (second != third) && (first != third)) {
            int max = 0;
            if (first > second) {
                if (first > third) {
                    max = first;
                } else {
                    max = third;
                }
            } else {
                if (second > third) {
                    max = second;
                } else {
                    max = third;
                }
            }
            price = max * 100;
        }

        System.out.println(price);
    }
}