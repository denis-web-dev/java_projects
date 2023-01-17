package timus.task_1581;
import java.util.Scanner;

public class task_1581 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество чисел: ");
        while (input.hasNext()) {
            int N = input.nextInt() - 1;
            System.out.println("Числа Васи: ");
            int num = input.nextInt();
            int count = 1;
            System.out.println("Числа Пети: ");
            if (N == 0) {
                System.out.println(count + " " + num);
                continue;
            }
            int nextNum = input.nextInt();
            while (N >= 0) {
                if (N != 0) {
                    if (num == nextNum) {
                        ++count;
                    } else {
                        System.out.print(count + " " + num + " ");

                        num = nextNum;
                        count = 1;
                    }
                } else {
                    System.out.print(count + " " + num + " ");
                }
                --N;
                if (N > 0) {
                    nextNum = input.nextInt();
                }
            }
            System.out.println();
        }
    }
}
