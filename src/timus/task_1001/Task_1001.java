package timus.task_1001;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_1001 {
    public static void main(String[] args) {
        // write your code here
        Scanner c = new Scanner(System.in);
        ArrayList<Double> l = new ArrayList<Double>();
        System. out.println("Входные данные: ");
    while(true){
            String str = c.nextLine();
            if (!str.isEmpty())
            {
                try {
                    Double d = Double.parseDouble(str);
                } catch (NumberFormatException e){
                    break;
                }
                l.add(0, Double.parseDouble(str));
            }
            else
            {
                break;
            }
        }
    System.out.println("Выходные данные: ");
        for (double a : l) {
            System.out.println(String.format("%(.4f",(double) Math.sqrt(a)));
        }
    }
}
