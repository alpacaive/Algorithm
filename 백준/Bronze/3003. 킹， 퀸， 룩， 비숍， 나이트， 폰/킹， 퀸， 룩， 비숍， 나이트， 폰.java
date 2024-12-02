import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();

        if (king != 1) {
            int n = 1 - king;
            System.out.print(n + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (queen != 1) {
            int n = 1 - queen;
            System.out.print(n + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (rook != 2) {
            int n = 2 - rook;
            System.out.print(n + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (bishop != 2) {
            int n = 2 - bishop;
            System.out.print(n + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (knight != 2) {
            int n = 2 - knight;
            System.out.print(n + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (pawn != 8) {
            int n = 8 - pawn;
            System.out.println(n);
        } else {
            System.out.println(0);
        }

    }
}