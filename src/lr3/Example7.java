package lr3;



public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] arr = new char[size];
        char b = 'a';
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b;
            b += 2;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
    }
}
