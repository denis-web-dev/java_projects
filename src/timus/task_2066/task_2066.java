package timus.task_2066;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int a,b,c;
        int sumMin =0;
        System.out.println("Введите числа: ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        in.close();
        if(b==0) {sumMin = a*b-c;}
        else if(b==1){sumMin = a-b-c;}
        else if (b>0){
            sumMin = a-b*c;}
        System.out.println("Минимальное значение выражения: ");
        System.out.print(sumMin);
        out.flush();
    }
}
