package lr7.Example2;

public class SuperClassTest2 {
    private String str;
    public int length;

    SuperClassTest2(String value) {
        this.str = value;
        this.length = value.length();
    }

    SuperClassTest2() {
        this.str = null;
        this.length = 0;
    }

    public void setStr(String str) {
        this.str = str;
        this.length = str.length();
    }

    public void setStr() {
        this.str = null;
        this.length = 0;
    }

    public String getStr() {
        return str;
    }
}

class SubClassTest2 extends SuperClassTest2 {
    public int value;

    SubClassTest2(String strEx) {
        super(strEx);
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setStr(String str, int value) {
        super.setStr(str);
        this.value = value;
    }

    @Override
    public void setStr(String str) {
        super.setStr(str);
    }

    public void setStr() {
        super.setStr();
    }
}
