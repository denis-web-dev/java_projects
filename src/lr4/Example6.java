package lr4;

import java.util.Random;

public class Example6 {
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
        System.out.println("Полученный массив");
        int row = random.nextInt(4);
        System.out.println("Строка: " + row);
        int col = random.nextInt(4);
        System.out.println("Столбец: " + col);
        int[][] arr1 = new int[x][y];
        for (int i = 0; i < arr1.length; i++){
            if (i != row) {
                for (int j = 0; j < arr1.length; j++){
                    if (j != col){
                        arr1[i][j] = arr[i][j];
                        System.out.printf("%d ", arr1[i][j]);
                    }
                }
                System.out.println();
            }

        }

    }
}
