import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count =0;
        int sum =0;
        while (count<3){
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            sum= sum+number;
            count+=1;

        }
        System.out.println("total sum of the numbers "+sum);










        }
    }

