package lr7.Example3;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(new SuperClassTest3(42));
        System.out.println(new InheritedClass(42, 'F'));
        System.out.println(new FinalClass(42, 'F', "text"));

        var sup = new SuperClassTest3(42);
        var inherited = new InheritedClass(42, 'F');
        var finalObject = new FinalClass(42, 'F', "text");

        sup.setValue(43);
        inherited.setValue(43, 'A');
        finalObject.setValue(43, 'A', "test text");

        System.out.println(sup);
        System.out.println(inherited);
        System.out.println(finalObject);
    }
}
