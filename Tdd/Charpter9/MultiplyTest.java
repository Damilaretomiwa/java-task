package Charpter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    Multiply number = new Multiply();


    @Test
    public  void  setNumberTest(){
        number.setNumber1(2,-9);
        System.out.println(number.getNumber());
        assertEquals(-2*9,number.getNumber());
    }

}