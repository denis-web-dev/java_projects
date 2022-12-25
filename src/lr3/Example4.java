package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();

//        if (x < y){
//            for (int i = x; i <= y;){
//                System.out.println(i + " ");
//                i++;
//            }
//        }else {
//            for (int i = y; i <= x;){
//                System.out.println(i + " ");
//                 i++;
//            }
//        }

//        if (x < y) {
//            do {
//                System.out.println(x);
//                x++;
//            }
//            while (x <= y);
//        } else {
//            do {
//                System.out.println(y);
//                y++;
//            }
//            while (y <= x);
//        }
        if(x < y){
        while (x <= y){
            System.out.println(x);
                x++;
        }
        } else {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        }
    }
}
