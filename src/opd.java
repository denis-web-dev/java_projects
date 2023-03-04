import java.util.*;
public class opd {
            public static void main(String[] args) {System.out.println("Введите планируемый срок выполнения проекта в месяцах: ");
                Scanner user = new Scanner(System.in);
                double pod = user.nextDouble();
                System.out.println("Введите запланированную сумму проекта: ");
                double planSum = user.nextDouble();
                System.out.println("Введите период прошедший с начала выполнения проекта в месяцах: ");
                double iod = user.nextDouble();
                System.out.println("Введите потраченную на текущий момент сумму: ");
                double used = user.nextDouble();
                System.out.println("Введите стадию готовности проекта на текущий момент в процентах :");
                int stage = user.nextInt();
                int actenro = (int) Math.round((iod * 30) / stage * 100);
                double actualSum = (used / stage) * 100;
                int delayTimeDays = (int) (actenro - pod * 30);
                double overBudgetRange = actualSum - planSum;
                System.out.printf("Задержка сроков проекта %d месяцев %d дней", delayTimeDays/30, delayTimeDays % 30);
                System.out.println();
                System.out.println("Перерасход бюджета составит: " + overBudgetRange + " " + "y.e");}
        }


