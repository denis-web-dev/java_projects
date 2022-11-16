package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String name = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите дату: ");
        float date = in.nextFloat();

        System.out.println("День недели: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Месяц: " + month);
        in.close();

    }
}
