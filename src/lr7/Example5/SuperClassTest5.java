package lr7.Example5;

public class SuperClassTest5 {
    protected String text;

    public SuperClassTest5(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperClassTest5{" + "text='" + text + '\'' + '}';
    }
}

class InheritedClass3 extends SuperClassTest5 {
    protected char character;

    public InheritedClass3(String text, char character) {
        super(text);
        this.character = character;
    }

    @Override
    public String toString() {
        return "InheritedClass3{" + "character=" + character + ", text='" + text + '\'' + '}';
    }
}

class InheritedClass4 extends SuperClassTest5 {
    protected int value;

    public InheritedClass4(String text, int value) {
        super(text);
        this.value = value;
    }

    @Override
    public String toString() {
        return "InheritedClass4{" + "value=" + value + ", text='" + text + '\'' + '}';
    }
}
