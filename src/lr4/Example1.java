package lr4;

public class Example1 {
    public static void main(String[] args) {
        int rows = 11; // число строк которое необходимо вывести
        int columns = 23; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (int i = 0 ; i < rows; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (int j = 0; j < columns; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }

    }
}
