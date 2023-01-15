package lr7.Example4;

class BaseClass2 implements Cloneable {
    public char character;

    public BaseClass2(char character) {
        this.character = character;
    }

    @Override
    protected BaseClass2 clone() throws CloneNotSupportedException {
        return (BaseClass2) super.clone();
    }
}

class InheritedClass2 extends BaseClass2 {
    public String text;

    public InheritedClass2(char character, String text) {
        super(character);
        this.text = text;
    }

    @Override
    protected InheritedClass2 clone() throws CloneNotSupportedException {
        var result = (InheritedClass2) super.clone();
        result.text = new String(this.text);

        return result;
    }
}

final class FinalClass2 extends InheritedClass2 {
    public int value;

    public FinalClass2(char character, String text, int value) {
        super(character, text);
        this.value = value;
    }

    @Override
    protected FinalClass2 clone() throws CloneNotSupportedException {
        return (FinalClass2) super.clone();
    }
}
