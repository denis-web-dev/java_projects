package lr3;

public class Example8 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        char b = 'A';
        for (int i = 0; i < arr.length; i++){
            switch (b){
                case 'A':
                    b++;
                    break;
                case 'E':
                    b++;
                    break;
                case 'I':
                    b++;
                    break;
            }
            arr[i] = b;
            b++;
            System.out.print(arr[i] + " ");
        }
    }
}
