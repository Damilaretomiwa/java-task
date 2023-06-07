package Charpter9;

public class Multiply {
    private int number1;
    private int number2;

    public void setNumber1(int number1,int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int getNumber() {
        int sum = 0;
//        if (number1 < 0 && number2 > 0){
//            for (int i = 0; i < number2; i++) {
//                sum+=number1;
//            }
//        }

            if (number2 < 0 && number1 > 0) {
                for (int i = 0; i < number1; i++) {
                    sum += number2;
                }
            }

        for (int i = 0; i < number1; i++) {
            sum += number2;

        }
        return sum;
    }
}
