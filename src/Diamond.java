public class Diamond {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            count--;
        }
        count = 1;
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            count++;
        }
    }
}
