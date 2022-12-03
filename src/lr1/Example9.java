package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String d;
        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите колличество дней: ");
        int count = in.nextInt();
        if (count == 31) {
            d = "день";
        }
        else d = "дней";



        System.out.println("Месяц: " + month + "-" + count + " " + d);

        in.close();

    }
}
