package lr11_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;


public class Task7_1
{
    public static void main(String[] args) throws InterruptedException {
        int n  = 9;
        List<Integer> list = new LinkedList<>();


        System.out.println("LinkedList:");
        fillList(n, list);
        System.out.println(list);               //заполнили и вывели лист
        clist(list);                      //моделируем удаление каждого 2 по очереди пока не останется 1
        //(после каждого удаления выводим список оставшихся)

        System.out.println(c(9, 2));      //просто поиск последнего (9- количество 2- шаг)
        nanoTime();

    }

    public static void fillList(int n, List list) {
        for(int i = 0; i < n; i++) {
            list.add(i + 1);
        }
    }

    public static int c(int n, int k) {
        if(n > 1)
            return (c(n - 1, k) + k - 1) % n + 1;
        else
            return 1;
    }

    public static void clist(List list) {
        int count = 0;
        Iterator<Integer> it = list.iterator();
        while(list.size() > 1) {
            if(it.hasNext()) {
                it.next();
                count++;
                if(count == 2) {
                    it.remove();
                    count = 0;
                    System.out.println(list);
                }
            }
            else {
                it = list.iterator();
            }
        }
    }

    public static void nanoTime() throws InterruptedException {
        long start = System.nanoTime();
        // выполнение какой-то логики
        Thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);
    }

}
