package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = in.nextInt();

        if ((x % 4 == 0)&(x >= 10)) {
            System.out.println("Число удовлетворяет");
        }
        else
            System.out.println("Число не удовлетворяет");

        in.close();

    }
}
