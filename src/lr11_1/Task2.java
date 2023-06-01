package lr11_1;

public class Task2 {
    public static int binary(int n)
    {
        if (n == 1) {

            return 1;
        }
        return binary(n / 2) * 10 + n % 2;
    }

    public static void main (String[] args) {
        int n = 100;
        System.out.println(binary(n));
    }

}
