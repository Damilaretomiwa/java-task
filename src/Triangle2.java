public class Triangle2 {
    public static void main(String[] args) {
        int count = 1;
        int increase = 1;
        int space =10;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < increase; j++) {
                System.out.print(count);
            }
            System.out.println();
            count++;
            increase += 2;
            space--;

        }
    }


}