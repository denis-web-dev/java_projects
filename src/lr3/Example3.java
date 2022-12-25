package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = in.nextInt();
        int num0 = 1;
        int num1 = 1;
        int num2;
        System.out.print(num0 + " " + num1 + " ");

//        Цикл for

//        for (int i = 3; i <= x; i++){
//            num2 = num0 + num1;
//            System.out.print(num2 + " ");
//            num0 = num1;
//            num1 = num2;
//        }


//        Цикл do

//        int i = 3;
//        do {
//            num2 = num0 + num1;
//            System.out.print(num2 + " ");
//            num0 = num1;
//            num1 = num2;
//            i++;
//        }
//        while (i <= x);


        //        Цикл while

            int i = 3;
            while (i <= x){
                num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
            i++;
            }

        System.out.println();

    }
}