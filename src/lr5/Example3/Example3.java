package lr5.Example3;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(10);
        System.out.println("Первое число: " + num1);
        int num2 = r.nextInt(10);
        System.out.println("Второе число: " + num2);

        Number n1 = new Number();
        Number n2 = new Number(num1);
        Number n3 = new Number(num1,num2);

    }

}
