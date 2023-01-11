package lr5.Example5;

public class Example5 {
    public static void main(String[] args) {
        // присвоение через конструктор
        Num n = new Num(53);
        System.out.println(n.Get());

        //присвоение значения полю через метод с аргументом
        n.Set(8);
        System.out.println(n.Get());

        //присвоение значения больше 100 полю через метод с аргументом
        n.Set(205);
        System.out.println(n.Get());

        //присвоение значения меньше 0 полю через метод с аргументом
        n.Set(-2);
        System.out.println(n.Get());

        //присвоение значение полю через метод без аргуметов
        n.Set();
        System.out.println(n.Get());
    }
}
