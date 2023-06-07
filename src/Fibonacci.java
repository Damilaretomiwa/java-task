////import java.text.BreakIterator;
////
//////public class Fibonacci {
//////    public static void main(String[] args) {
//////
//////    }
//////    public static void fibonacci(int n) {
//////        int firstNum = 0,
//////                secondNum = 1;
//////        System.out.print(firstNum + " " + secondNum);
//////        for (int i = 0; i <5; i++) {
//////            int c = firstNum + secondNum;
//////            System.out.print( + c);
//////            firstNum = secondNum;
//////            secondNum = c;
//////            i++;
//////            System.out.println();
//////        }
//////
//////    }
//////
//////}
////public class Fibonacci {
////    public static void main(String[] args) {
////
////        for (int i = 0; i < 10; i++) {
////            if (i == 5) {
////                break;
////            }
////            System.out.println(i);
////        }
////
////
////
////
////    }
////        }
////
//public class Fibonacci {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i <=10) {
//            i++;
//            if (i == 5) {
//                break;
//
//            }
//            System.out.println(i);
//
//        }
//
public class Fibonacci {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 3) {

                continue;
            }
            System.out.println(i);
        }
    }


}