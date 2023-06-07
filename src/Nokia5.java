import java.util.Scanner;

public class Nokia5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Menu = scanner.nextInt();
        System.out.println("""
                 ****************                         ****************
                                          *    NOKIA   *
                                          ****************
                1. Phone book
                2. Message
                3. Chat
                4. Call register
                5. Tones1
                6.Settings
                7. Call divert
                8.Game
                9.Calculator
                10.Reminders
                11.Clock
                12.Profiles
                13.SIM services3
                """);

        switch (Menu) {
            case 1:
                System.out.println("""
                        PHONEBOOK
                        1.Search
                        2.Service Nos. 1
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send b’card
                        8.Option
                        
                         
                                       
                       
                        """);
                switch (Menu){
                    case  8 -> System.out.println("""
                            Option
                            1.Type of view
                            2.Memory status
                            """);
                }

                }

                }
        }

