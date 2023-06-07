import java.util.Scanner;

public class ReverseMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for (int i = number; i >= 1; i--) {
            System.out.println("10 x " + i + " = " + (number * i));
            System.out.println();
        }
    }
}

