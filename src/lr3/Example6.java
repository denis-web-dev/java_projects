package lr3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int count = in.nextInt();
        int num = 0;
        Random random = new Random();
        if (count > 0) {
            int[] arr = new int[count];
            for (int i = 0; i < arr.length; i++) {
                boolean iterator = true;
                while (iterator){
                    num = random.nextInt(100);
                    if (num % 5 == 2) {

                        iterator = false;
                    }
                }
                arr[i] = num;
            }
            System.out.println(Arrays.toString(arr));
        } else
            System.out.println("Введено не корректное значение");
//

    }
}
