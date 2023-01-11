package lr5.Example5;

public class Num {
    private int number;

    public void Set(int num) {
        System.out.println("Метод c аргументом");
        number = num;
        if (num >= 100) {
            this.number = 100;
        }
        else if (num < 0) {
            this.number = 0;
        }
    }

    public void Set() {
        System.out.println("Метод без аргумента");
        this.number = 0;
    }

    Num (int number) {
        System.out.println("Конструктор:");
        this.Set(number);
    }

    public int Get() {
        return number;
    }
    }
