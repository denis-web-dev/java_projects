package lr6.Example10;

public class MaxMin {
    static int[] maxmin;

    static int[] SetMaxmin(int ... arr){
        int max = arr[0];
        int min = arr[0];

        for (int i =0; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
            else if(arr[i]< min) {
                min = arr[i];
            }
        }
        maxmin = new int[]{max, min};

        return maxmin;
    }
    static void view() {
        System.out.println("arr - max: " + maxmin[0]);
        System.out.println("arr - min: " + maxmin[1]);
    }

}
