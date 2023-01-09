package lr5.Example4;

public class Number {
    private char s;
    private int num;

    Number(double a){
        s = (char) a;
        num = (int)((a-(int) a)*100);
        System.out.println("Целая часть - символ: " + s +"   Дробная часть: " + num);
    }

    Number(char s, int num){
        this.s = s;
        this.num = num;
        double result = (double) s + (double) num/100;

        System.out.println("Полученное число: " + result);
    }

}
