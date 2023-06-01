package lr11_1;

public class Example5 {
    public static void main (String[] args) {
        System.out.println("\n\rFibonacci[5] = " + fibNum(5));
    }

    private static int fibNum(int n) {
        System.out.println("Последовательность вызовов: ");
        return Fact(n, 0);
    }

    public static int Fact(int n, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print('\t');
        }
        System.out.println("Вызовы[" + n + "]");
        i++;
        if(n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return Fact(n-2,i) + Fact(n-1,i);
        }
    }
}
