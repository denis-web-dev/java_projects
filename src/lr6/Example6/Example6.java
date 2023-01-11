package lr6.Example6;

public class Example6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println("Второй аргумент меньше длины массива");
        Array array = new Array();
        for (int i = 0; i < array.SetArr(arr1, 6).length; i++) {
            System.out.println("arr[" + i + "] = " + array.SetArr(arr1, 6)[i]);
        }
        System.out.println("Второй аргумент больше длины массива");
        Array.SetArr(arr1, 32);
        Array.view();

    }
}
