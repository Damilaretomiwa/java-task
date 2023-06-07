import java.util.Scanner;

public class plus {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a four digit number");
            int number = scanner.nextInt();

            int a = number % 1000;
            int s = a/100;
            int d = a % 100;
            int t = d/10;
            int lastNumber = d % 10;
            int firstNumber = number/1000;

            int sum = firstNumber + s + t + lastNumber;
            System.out.printf("the sum of %d + %d + %d + %d is %d", firstNumber, s, t, lastNumber, sum);
        }

    }

