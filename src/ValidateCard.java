//import java.util.Objects;
//
//public class ValidateCard {
//    package card;
//
//import java.util.Arrays;
//import java.util.Objects;
//import java.util.Scanner;
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("enter card number");
//            String cardNumber = scanner.nextLine();
//            creditCardValidator(cardNumber);
//        }
//
//        public static void creditCardValidator(String cardNumber){
//            String[] cardNumbers = cardNumber.split("");
//            if (cardNumbers.length < 13 || cardNumbers.length > 16){
//                throw new RuntimeException("invalid card number");
//            }
//            String[] array = new String[1]{
//            System.out.println();
//            String cardType;
//            if (Objects.equals(cardNumbers[0], "4")){
//                cardType = "Visa_card";
//                System.out.println("**CreditCardType: "+ cardType);
//            }
//            if (Objects.equals(cardNumbers[0], "5")) {
//                cardType = "Master_card";
//                System.out.println("**CreditCardType: "+ cardType);
//            }
//            if (Objects.equals(cardNumbers[0], "3") && Objects.equals(cardNumbers[1], "7")){
//                cardType = "American_Express";
//                System.out.println("**CreditCardType: "+ cardType);
//            }
//            if (Objects.equals(cardNumbers[0], "6")){
//                cardType = "Discover_Card";
//                System.out.println("**CreditCardType: "+ cardType);
//
//            }
//            int sum = 0;
//            for (int i = 0; i < cardNumbers.length; i+=2) {
//                if ((Integer.parseInt(cardNumbers[i]) * 2) > 9){
//
//                }
//                sum +=(Integer.parseInt(cardNumbers[i]) * 2);
//            }
//        }
//    }
//
//}
