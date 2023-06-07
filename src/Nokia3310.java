import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


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
        int Menu = scanner.nextInt();

        switch (Menu) {
            case 1 -> {
                System.out.println("""
                        1.**PHONEBOOK**
                        1.Search
                        2.Service Nos. 1
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send b’card
                        8.Option
                        9.Speed dials
                        10.Voices
                        0. back
                        """);
                int input = scanner.nextInt();
                switch (input) {
                    case 8:
                        System.out.println("""
                                1. Type of view
                                2. Memory status
                                0.Back
                                """);



                }
            }
            case 2 -> System.out.println("""
                    2.**MESSAGES**
                    1.Write message
                    2.Inbox
                    3.Outbox
                    4.Picture messages
                    5.Templates
                    6.Smileys
                    7,Message settings
                    8.Info service
                    9.Voice mailbox number
                    10.Service command editor
                    0.Back
                    """);
            case 3 -> System.out.println("""
                    3.**CHAT**
                    0.Back
                    """);
            case 4 -> {
                System.out.println("""
                        4.**CALL REGISTER
                        1.Missed calls
                        2.Received calls
                        3.Dialled numbers
                        4.Erase recent call lists
                        5.Show call duration
                        6.Show call costs
                        7.Call cost settings
                        8.Prepaid credit
                        0.Back
                        """);
                int input = scanner.nextInt();
                switch (input) {
                    case 5:
                        System.out.println("""
                                1.Last call duration
                                2.All calls’ duration
                                3.Received calls’ duration
                                4.Dialled calls’ duration
                                5.Clear timers
                                0.Back
                                """);
                }
            }
            case 5 -> System.out.println("""
                    5.**TONES**
                    1.Ringing tone
                    2..Ringing volume
                    3.Incoming call alert
                    4.Composer
                    5.Message alert tone
                    6.Keypad tones
                    7.Warning and game tones
                    8.Vibrating alert
                    9.Screen saver
                    0.Back
                    """);

            case 6 -> System.out.println("""
                    6.**SETTINGS**
                    1.Call settings
                    2.Phone settings
                    3.Security settings
                    4.Restore factory settings
                    0.Back
                    """);
            case 7 -> System.out.println("""
                    7.**CALL DIVERT**
                    0.Back
                    """);
            case 8 -> System.out.println("""
                    8.**GAMES**
                    0.Back
                    """);
            case 9 -> System.out.println("""
                    9.**CALCULATOR**
                    0.Back
                    """);
            case 10 -> System.out.println("""
                    10.**REMINDERS**
                    0.Back
                    """);
            case 11 -> System.out.println("""
                    11.**CLOCK**
                    1.Alarm clock
                    2.Clock settings
                    3.Date setting
                    4.Stopwatch
                    5.Countdown timer
                    6.Auto update of date and time
                    0.Back
                    """);
            case 12 -> System.out.println("""
                    12.**PROFILES**
                    0.Back
                    """);
            case 13 -> System.out.println("""
                    13.**SIM SERVICES 3**
                    0.Back
                    """);

            default -> throw new IllegalStateException("Unexpected value: " + Menu);

        }
    }
}