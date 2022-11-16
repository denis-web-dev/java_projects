package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите колличество дней: ");
        float age = in.nextFloat();


        System.out.println("Месяц: " + month);
        System.out.println("Месяц содержит: " + age);
        in.close();

    }
}
