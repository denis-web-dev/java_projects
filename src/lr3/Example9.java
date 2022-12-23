package lr3;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        int min;
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[0];
        for (int x = 1; x < arr.length; x++){
            if (arr[x] <= min){
                min = arr[x];
            }
        }
        for (int x = 0; x < arr.length; x++){
            if (arr[x] == min){
                System.out.print(x + ": " + arr[x] + "\n");
            }
        }
    }
}
