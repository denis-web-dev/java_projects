package timus.task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("Введите количество панелей и их размер: ");
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int result = (n * (a*b)) * 2;
        System.out.println("Необходимый вес: " + result);
        System.out.flush();
    }
}