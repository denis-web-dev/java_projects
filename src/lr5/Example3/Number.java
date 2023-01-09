package lr5.Example3;

public class Number {
    private int a;
    private int b;
    Number(){
        System.out.println("Конструктор без аргументов");
    }
    Number(int a){
        this.a = a;
        System.out.println("Конструктор с 1 аргументом - сложение a + a: " + Plus(a));
    }
    public int Plus (int a){
        this.a = a;
        int result = a + a;
        return result;
    }
    Number(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Конструктор с 2 аргументами - умножение a * b: " + Multy(a,b));
    }
    public int Multy(int a, int b){
        int result = a * b;
        return result;
    }

}
