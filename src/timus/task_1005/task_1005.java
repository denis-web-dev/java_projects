package timus.task_1005;
import java.util.Arrays;
import java.util.Scanner;

public class task_1005 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество камней: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum;
        int sum1;
        int sum2;
        System.out.println("Вес камней: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        sum1 = arr[n-1];
        sum2 = arr[n-2];
        for (int i=n-3; i >= 0; i--)
        {
            if (sum1 > sum2) sum2 += arr[i];
            else sum1 += arr[i];
        }
        if (sum1 > sum2) sum = sum1 - sum2;
        else sum = sum2 - sum1;
        System.out.println("Минимальная разность весов двух куч: ");
        System.out.println(sum);
    }
}
