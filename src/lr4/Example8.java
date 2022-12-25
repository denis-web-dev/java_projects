package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        char[] arr = text.toCharArray();
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            num[i] = arr[i] + key;
        }
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (char) num[i];
        }
        String SecondText = new String(arr);

        System.out.print("Текст после преобразования :" + SecondText);

        System.out.println("\nВыполнить обратное преобразование? (y/n)");
        boolean iterator = false;
        while (!iterator) {
            String ans = in.next();

            if (ans.equals("y")) {
                for (int i = 0; i < arr.length; i++) {
                    num[i] = arr[i] - key;
                }
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (char) num[i];
                }
                String FirstText = new String(arr);
                System.out.print("Обратное преобразование: " + FirstText);
                iterator = true;
            }

            else if (ans.equals("n")) {
                System.out.println("До свидания!");
                iterator = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
                iterator = false;
            }
        }
    }
}
