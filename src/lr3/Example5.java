package lr3;

import java.util.Random;
import java.util.Scanner;

import static com.sun.tools.doclint.Entity.sum;

public class Example5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x = in.nextInt();
//        Random random = new Random();
//       int num = random.nextInt(x);
        int y1 = 0;
        int sum = 0;
        for (int i = 0; i <= x; i++){
            int y = (int) Math.round(Math.random()*10);
            System.out.println(y);
            if ((y % 5 == 2) || (y % 3 == 1)){
                sum = y + y1;
                y1 = y;
            }
        }
        System.out.println("Сумма " + sum);



    }
}
