import java.util.Scanner;

public class Nokia3310Back {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Main Menu");
                System.out.println("1. Option 1");
                System.out.println("2. Option 2");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Option 1 selected");
                        backMenu(scanner);
                        break;
                    case 2:
                        System.out.println("Option 2 selected");
                        backMenu(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

        public static void backMenu(Scanner scanner) {
            while (true) {
                System.out.println("Back Menu");
                System.out.println("1. Go back to main menu");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        return;
                    case 2:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }




