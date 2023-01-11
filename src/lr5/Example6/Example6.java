package lr5.Example6;

public class Example6 {
    public static void main(String[] args) {
        // конструктор с 2 аргументами
        Num n = new Num(12,86);
        n.viewNum();
        //конструктор с 1 аргументом
        n = new Num(48);
        n.viewNum();
        //метод с 2 аргументами
        n.Set(6,10);
        n.viewNum();
        //метод с 1 аргументом
        n.Set(9);
        n.viewNum();

    }
}
