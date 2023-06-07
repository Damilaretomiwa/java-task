public class LowestElement {
    public static void main(String[] args) {
        int[] Array = {4, 8, 6, 5, 77, 89, 7, 22};
        System.out.println(lowestElement(Array));

    }

    public static int lowestElement(int[] array) {
        int lowestNumber = array[0];
        for (int count : array) {
            if (count <= lowestNumber) {
                lowestNumber = count;
            }

        }
        return lowestNumber;

    }
}
