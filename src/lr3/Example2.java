package lr3;

import java.util.Objects;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String num = in.nextLine();
//        switch (num){
//            case "Понедельник":
//                System.out.println("1");
//                break;
//            case "Вторник":
//                System.out.println("2");
//                break;
//            case "Среда":
//                System.out.println("3");
//                break;
//            case "Четверг":
//                System.out.println("4");
//                break;
//            case "Пятница":
//                System.out.println("5");
//                break;
//            case "Суббота":
//                System.out.println("6");
//                break;
//            case "Воскресенье":
//                System.out.println("7");
//                break;
//            default:
//                System.out.println("Такого дня не существует");
//        }


        if (Objects.equals(num, "Понедельник")){
            System.out.println("1");
        }
        else if (Objects.equals(num, "Вторник")){
            System.out.println("2");
        }
        else if (Objects.equals(num, "Среда")) {
            System.out.println("3");
        }
        else if (Objects.equals(num, "Четверг")){
        System.out.println("4");
        }
        else if (Objects.equals(num, "Пятница")) {
        System.out.println("5");
        }
        else if (Objects.equals(num, "Суббота")){
        System.out.println("6");
        }
        else if (Objects.equals(num, "Воскресенье")) {
        System.out.println("7");
        }
        else {
            System.out.println("Такого дня не существует");
        }


    }
}
