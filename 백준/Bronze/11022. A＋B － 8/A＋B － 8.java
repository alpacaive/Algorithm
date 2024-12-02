import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//
//        for(int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine(),  " ");
//            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
//        }
//        br.close();
//
//        bw.flush();
//        bw.close();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 
        for (int i = 1; i <= N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }
    }
}