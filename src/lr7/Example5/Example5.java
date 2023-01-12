package lr7.Example5;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(new SuperClassTest5("test 2"));
        System.out.println(new InheritedClass3("test 2", 'X'));
        System.out.println(new InheritedClass4("test 2", 42));
        var x = (SuperClassTest5) new InheritedClass4("test 2", 42);
        System.out.println(x);
    }
}
