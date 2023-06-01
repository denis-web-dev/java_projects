package lr11_1;
import java.util.Scanner;
public class Task3 {
    public static int[] arr = new int[5];
    static Scanner in = new Scanner(System.in);
    public static int x = 0;

    public static int[] Arr(int n) {
        if (x == n) return arr;
        else {
            System.out.print((x + 1) + " элемент массива: ");
            arr[x++] = in.nextInt();
        }
        return Arr(n);
    }

    public static void main(String[] args) {
        int[] out = Arr(5);
        for (int el : out) System.out.print(el + " ");
    }

}
