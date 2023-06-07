package Charpter3;

import java.util.Arrays;

public class ArrangeList {
    public static void main(String[] args) {
        int[] Array = new int[6];
        int[] Array2 = {1, 3, 4, 5, 6, 2};
        int [] result = sortArrays(Array2);
        System.out.println(Arrays.toString(result));
    }


    public static int [] sortArrays(int[] arrays) {
        int[] arr = new int[arrays.length];
        int k = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] < arrays[j]) {
                    arr[i] = arrays[i];
                }else arr[i] = arrays[j];

            }
        }
        return arr;
    }
}