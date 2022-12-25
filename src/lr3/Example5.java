package lr3;

import java.util.Random;
import java.util.Scanner;

//import static com.sun.tools.doclint.Entity.sum;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
//        x - количество чисел которое задается с клавиатуры
        int x = in.nextInt();
//         y - числа которые выводится рандомно(выводит)
//        sum - сумма всех чисел
        int sum = 0;

//        Цикл for

//        for (int i = 0; i < x; i++) {
//            int y = (int) Math.round(Math.random() * 10);
//            if ((y % 5 == 2) || (y % 3 == 1)) {
//                System.out.println(y);
//                sum = sum + y;
//            }
//        }
//        System.out.println("Сумма " + sum);

//       Цикл while

//        int i = 0;
//        while (i < x) {
//            int y = (int) Math.round(Math.random() * 10);
//            if ((y % 5 == 2) || (y % 3 == 1)) {
//                System.out.println(y);
//                sum = sum + y;
//                i++;
//            }
//    }
//        System.out.println("Сумма " + sum);

//        Цикл do while

        int i = 0;
        do {
            int y = (int) Math.round(Math.random() * 10);
            if ((y % 5 == 2) || (y % 3 == 1)) {
                System.out.println(y);
                sum = sum + y;
                i++;

            }
        }
            while (i < x) ;
            System.out.println("Сумма " + sum);
        }
    }