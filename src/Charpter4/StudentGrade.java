package Charpter4;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score? \n");
        int score = scanner.nextInt();
        if (score >= 90){
            System.out.println("your grade is A,you pass the course");
        }
        else if (score >= 80){
            System.out.println("your grade is B,you pass the course");
        }
        else  if (score >= 70){
            System.out.println("your grade is C,you pass the course");
        }
        else if (score >= 60){
            System.out.println("your grade is D,you pass the course");
        }
        else
            System.out.println("your grade is F, you fail this course");
    }

}
