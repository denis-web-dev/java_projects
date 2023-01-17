package timus.task_1409;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1409 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        byte Harry, Larry, Sum;
        System.out.println("Количество банок, простреленных Гарри и Ларри: ");
        Harry = in.nextByte();
        Larry = in.nextByte();
        in.close();
        Sum = (byte) (Harry+Larry-1);
        Harry = (byte) (Sum-Harry);
        Larry = (byte) (Sum-Larry);
        System.out.println("Количество банок, не простреленных Гарри и Ларри: ");
        System.out.print( Harry + " " + Larry);
        out.flush();
    }
}
