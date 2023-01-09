package lr5.Example1;

public class Symbol {
    private char Donate;

    public void setDonate(char donate) {
        Donate = donate;
    }

    public int getDonate() {
        return (int) Donate;
    }
    public void viewDonate(){
        System.out.println("Символ: " + Donate);
        System.out.println("Код символа: " + getDonate());
    }

}
