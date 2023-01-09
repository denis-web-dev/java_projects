package lr5.Example2;

public class Symbol {
    public char s1;
    public char s2;

    public void setS1(char s1, char s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void viewS1() {
        int num1 = s1;
        int num2 = s2;
        if (s1 > s2) {
            num1 = s2;
            num2 = s1;
        }
        for (int i = num1; i <= num2; i++) {
            System.out.println((char) i);
        }
    }
}
