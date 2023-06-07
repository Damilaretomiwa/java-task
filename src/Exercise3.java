import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int count = 2;
        while (count <= number) {
            System.out.println(count);
            count += 2;


        }
    }
}













