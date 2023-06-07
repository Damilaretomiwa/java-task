package Charpter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarmUpTest {
    WarmUp number = new WarmUp();

@Test
  public void testArrayNumber(){
    number.setArrayNumber("1,2,3,4,5,6,7,8");
    System.out.println(number.getArrayNumber());
    assertEquals("1,2,3,4,5,6,7,8",number.getArrayNumber());
}
}