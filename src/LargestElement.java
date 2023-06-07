public class LargestElement {
    public static void main(String[] args) {
        int[] Array = {1,45,1,6,13};


        System.out.println(largestElement(Array));
    }


    public static int largestElement(int[] array) {
        int largestNumber = 0;
        for (int count:array){
            if(count < largestNumber)
                largestNumber= count;


    }
        return largestNumber;
}
}