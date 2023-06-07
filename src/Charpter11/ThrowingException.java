package Charpter11;

public class ThrowingException {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(3);


    }
    public static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0);
        throw new AgeLessThanZeroException();


    }

}
