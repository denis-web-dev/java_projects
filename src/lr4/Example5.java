package lr4;

import java.sql.Array;
import java.util.Random;
import java.util.Arrays;
public class Example5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int[][] arr = new int[x][y];
        Random random = new Random();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = random.nextInt(10);
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Полученный массив:");
        int[][] arr1 = new int[y][x];
        for (int i = 0; i < y; i++){
            for (int j = 0; j < x; j++){
                arr1[i][j] = arr[j][i];
                System.out.printf("%d ", arr1[i][j]);
            }
            System.out.println();
        }
    }
}
