package lr6.Example1;

public class Strings {
    private char s;
    private String str;

    public void Set(char symbol) {
        s = symbol;
        System.out.println("Метод c символьным аргументом: " + s);
    }

    public void Set(String string) {
        str = string;
        System.out.println("Метод c текстовым аргументом: " + str);
    }

    public void Set(char [] Array) {
        if (Array.length == 1){
            s = Array[0];
            System.out.println("\nМетод с одним элементом массива: " + s);
        }
        else {
            str = new String(Array);
            System.out.println("Метод с несколькими элементами массива: " + str);
        }
    }
}
