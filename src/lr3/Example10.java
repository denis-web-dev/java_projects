package lr3;

import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        int num;
        int[] arr = new int[10];
        Random random = new Random();
        System.out.println("Массив со случайными числами:");
//        Проходим по элементам массива, от нулевого до предпоследнего
        for (int i = 0; i < arr.length; i++){
//            Заполняем массив рандомными числами
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Отсортированный массив:");
//        Во внешнем цикле мы берем элемент, который будем сравнивать
        for (int j = 0; j < arr.length - 1; j++){
//            Берем элементы, с которыми будем сравнивать
            for (int k = j + 1; k < arr.length; k++){
                if (arr[j] < arr[k]){
                    num = arr[j];
                    arr[j] = arr[k];
                    arr[k] = num;

                }
            }
        }
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }

    }
}
