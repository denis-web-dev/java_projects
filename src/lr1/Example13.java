package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = in.nextInt();


        System.out.println("Введите второе число: ");
        int y = in.nextInt();

        int sum = x + y;



        System.out.println("Сумма двух чисел: " + sum);

        in.close();

    }
}
