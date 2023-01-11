package lr6.Example6;

public class Array {
    private static int arr2[];
    static int[] SetArr(int arr1[], int num) {

        if (num > arr1.length) {
            num = arr1.length;
        }
        arr2 = new int[num];
        for (int i = 0; i < num; i++) {
            arr2[i] = arr1[i];
        }
        // возвращает ссылку на новый массив
        return arr2;
    }

    static void view()
    {
        for (int i = 0; i < Array.arr2.length; i++) {
            System.out.println("arr[" + i + "] = " + arr2[i]);
        }
    }

}
