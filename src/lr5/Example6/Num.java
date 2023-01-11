package lr5.Example6;

public class Num {
    private int max;
    private int min;

    public void Set(int x, int y) {
        System.out.println("Метод c 2 аргументами");
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
    }

    public void Set(int x) {
        System.out.println("Метод c 1 аргументом");
        if (x < min) {
            min = x;
        } else {
                max = x;
        }
    }

    Num (int x, int y) {
        System.out.println("Конструктор с 2 аргументами");
        Set(x,y);
    }

    Num (int x) {
        System.out.println("Конструктор c 1 аргументом");
        Set(x);
    }

    public void viewNum() {
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
