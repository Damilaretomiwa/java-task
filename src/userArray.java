import java.util.Arrays;

public class userArray {
    public static void main(String[] args) {
        int[][] arr = new  int[5][];
        arr[0] =  new int [5];
        arr[1] =  new int [3];
        arr[2] =  new int [3];
        arr[3] =  new int []{100,500};
        arr[4] =  new int [5];

        for (int index = 0; index < arr[0].length; index++) {
            arr[0][index] = index;
        }
        for (int index = 0; index < arr[1].length; index++) {
            arr[1][index] = index;

        }
        for (int index = 0; index < arr[2].length ; index++) {
            arr[2][index] =index;

        }
        int count = 100;
        for (int index = 0; index < arr[4].length; index++) {
            arr[4][index] = count;
            count+=100;


        }
            System.out.println(Arrays.deepToString(arr));


        }

    }

