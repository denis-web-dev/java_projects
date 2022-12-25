package lr4;

import java.util.Random;

public class Example7 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int col = 0;                      //подсчет столбцов
        int row = 0;                        // подсчет строк
        int b = 0;

        for (int i = 0; row < arr.length; row++) {

            //заполнение строки массива слева-направо
            for (int j = 0; j < (arr.length - col); j++) {
                arr[i][j] = b;
                b++;
            }

            if(i < arr.length-1) {
                i++;}

            //заполнение столбца массива снизу-вверх
            for (int j=arr.length-1; j > col; j--) {
                arr[j][arr.length-1-col] = b;
                b++;
            }
            col++;
        }

        //вывод полученного массива
        for (int i = 0; i < arr.length; i++){
            for (int k = 0; k < arr.length; k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }

    }
}
