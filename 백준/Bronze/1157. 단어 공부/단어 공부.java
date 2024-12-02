import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'A']++;
        }

        int maxFreq = -1;
        char maxChar = '?';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) (i + 'A');
            } else if (freq[i] == maxFreq) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}