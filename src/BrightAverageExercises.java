import java.util.Arrays;
import java.util.Scanner;

public class BrightAverageExercises {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
         int[] EvenNumber = new int[5];
        for (int index = 0; index < EvenNumber.length; index++) {
            System.out.println("Enter 1 number");
            int number = user.nextInt();
            if (number%2 == 0 && number > 0){
                EvenNumber[index] = number;
            }
            else {
                System.out.println("you enter a wrong value!");
                index-=1;
            }
            System.out.println(Arrays.toString(EvenNumber));

        }
    }
}


