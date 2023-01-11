package lr3;

import java.util.Objects;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String num = in.nextLine();
/*        switch (num){
            case "Понедельник":
                System.out.println("1 день");
                break;
            case "Вторник":
                System.out.println("2 день");
                break;
            case "Среда":
                System.out.println("3 день");
                break;
            case "Четверг":
                System.out.println("4 день");
                break;
            case "Пятница":
                System.out.println("5 день");
                break;
            case "Суббота":
                System.out.println("6 день");
                break;
            case "Воскресенье":
                System.out.println("7 день");
                break;
            default:
                System.out.println("Такого дня не существует");
        }

 */

//        Версия программы на основе вложенных условных операторов:

        if (Objects.equals(num, "Понедельник")){
            System.out.println("1 день");
        }
        else if (Objects.equals(num, "Вторник")){
            System.out.println("2 день");
        }
        else if (Objects.equals(num, "Среда")) {
            System.out.println("3 день");
        }
        else if (Objects.equals(num, "Четверг")){
        System.out.println("4 день");
        }
        else if (Objects.equals(num, "Пятница")) {
        System.out.println("5 день");
        }
        else if (Objects.equals(num, "Суббота")){
        System.out.println("6 день");
        }
        else if (Objects.equals(num,  "Воскресенье")) {
        System.out.println("7 день");
        }
        else {
            System.out.println("Такого дня не существует");
        }
    }
}
