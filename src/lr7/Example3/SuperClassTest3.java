package lr7.Example3;

public class SuperClassTest3 {
    protected int value;

    public SuperClassTest3(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperClassTest3{" + "value=" + value + '}';
    }
}

class InheritedClass extends SuperClassTest3 {
    public char character;

    public InheritedClass(int value, char character) {
        super(value);
        this.character = character;
    }

    public void setValue(int value, char character) {
        this.value = value;
        this.character = character;
    }

    @Override
    public String toString() {
        return "InheritedClass{" + "character=" + character + ", value=" + value + '}';
    }
}

final class FinalClass extends InheritedClass {
    public String text;

    public FinalClass(int value, char character, String text) {
        super(value, character);
        this.text = text;
    }

    public void setValue(int value, char character, String text) {
        this.value = value;
        this.character = character;
        this.text = text;
    }

    @Override
    public String toString() {
        return "FinalClass{" + "text='" + text + '\'' + ", character=" + character + ", value=" + value + '}';
    }
}
