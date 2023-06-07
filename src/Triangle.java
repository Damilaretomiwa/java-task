public class Triangle {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

        }
    }

}