package timus.task_1197;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1197 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n;
        System.out.println("Введите число строк:");
        n = in.nextInt();
        char[] lit = new char[n];
        int[] num = new int[n];
        int[] sum = new int[n];
        System.out.println("Клетки шахматной доски:");
        for (int i = 0; i < n; i++) {
            String temp = in.next();
            char[] tempChar = temp.toCharArray();
            char c = tempChar[0];
            lit[i] = c;
            num[i] = tempChar[1]-'0';
            if (c > 98 && c < 103) {
                sum[i] = 8;
                if (num[i] == 2 || num[i] == 7) {
                    sum[i] -= 2;
                } else if (num[i] == 1 || num[i] == 8) {
                    sum[i] -= 4;
                }
            } else if (c == 98 || c == 103) {
                sum[i] = 6;
                if (num[i] == 2 || num[i] == 7) {
                    sum[i] -= 2;
                } else if (num[i] == 1 || num[i] == 8) {
                    sum[i] -= 3;
                }
            } else {
                sum[i] = 4;
                if (num[i] == 2 || num[i] == 7) {
                    sum[i] -= 1;
                } else if (num[i] == 1 || num[i] == 8) {
                    sum[i] -= 2;
                }
            }
        }
        in.close();
        System.out.println("Количество клеток, находящихся под боем коня: ");
        for(int i = 0; i < n; i++){
            System.out.println(sum[i]);}
        out.flush();
    }
}
