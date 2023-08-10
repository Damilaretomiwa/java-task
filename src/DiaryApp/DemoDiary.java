package DiaryApp;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static final Diary diary = new Diary();
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy - hh:mm a");
    private static final LocalDateTime now = LocalDateTime.now();

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        startDiary();
    }

    public static void goToMainMenu() throws InterruptedException, IOException {
        String mainMenu = "          " + dateTimeFormatter.format(now) + "\n" + """
                +=============================+
                    WELCOME TO Bright DIARY
                +=============================+
                1 =>  CREATE ENTRY
                2 =>  VIEW ENTRY
                3 =>  DELETE ENTRY
                4 =>  EXIT
                +=============================+
                """;

        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> deleteEntry();
            case '4' -> exitDiary();
            default -> goToMainMenu();
        }
    }

    public static void startDiary() throws InterruptedException, IOException, ClassNotFoundException {
        display("...WELCOME TO Bright DIARY...");
        String password = "bright";
        String unlockDiary = input("Enter your password");
        while (!unlockDiary.equals(password)) {
            unlockDiary = input("Enter your password");
        }
        goToMainMenu();

    }

    private static void exitDiary() throws IOException {
        display("Diary saved...");
        display("Thank you for using diary.");
    }

    private static void createEntry() throws InterruptedException, IOException {
        String entryTitle = input("Enter your diary title");
        String entryBody = input("Enter your diary body");
        diary.createEntry(entryTitle, entryBody);
        display("Entry (ID: " + diary.countEntry() + ") created successfully" + "\n" + dateTimeFormatter.format(now));
        goToMainMenu();
    }

    private static void viewEntry() throws InterruptedException, IOException {
        int entryID = Integer.parseInt(input("Enter your diary ID"));
        try {
            String entryBody = diary.viewEntry(entryID);
            display(entryBody);
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
        }
        goToMainMenu();
    }

    private static void deleteEntry() throws InterruptedException, IOException {
        try {
            int entryID = Integer.parseInt(input("Enter your diary ID"));
            display(diary.viewEntry(entryID));
            diary.deleteEntry(entryID);
            display("Entry Deleted \n" + dateTimeFormatter.format(now));
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
        }
        goToMainMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
}

