import java.util.Scanner;

public class Loopbright2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = Scanner.nextInt();
        int count = 0;

        while (count < number1) {
            System.out.println("Enter second number");
            int number2 = Scanner.nextInt();
            count = count + number2;
        }
        System.out.println("Number is :" + " " + number1);
        System.out.println();



    }
}

























































