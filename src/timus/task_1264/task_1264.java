package timus.task_1264;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class task_1264 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int N,M;
        System.out.println("Введите целые числа:");
        N=in.nextInt();
        M=in.nextInt();
        in.close();
        int time = N*(M+1);
        System.out.println("Количество секунд: ");
        System.out.print(time);
        out.flush();
    }
}
