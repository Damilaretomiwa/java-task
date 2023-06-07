import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionNumberTest {
    public static void main(String[] args) {

    }
    static AdditionNumber number = new  AdditionNumber();


    @Test
    public void testAdditionNumber(){
        number.setAddition(2,3);
        assertEquals(5,number.getAAdditionNumber());

    }

}