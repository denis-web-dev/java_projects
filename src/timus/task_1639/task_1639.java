package timus.task_1639;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1639 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        System.out.println("Введите числа:");
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        int t = (a*b)%2;
        String res;
        if (t==0){
            res = "[:=[first]";
        }
        else{
            res = "[second]=:]";
        }
        System.out.println(res);
        out.flush();
    }
}
