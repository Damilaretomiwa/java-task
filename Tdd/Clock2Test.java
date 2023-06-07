
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class Clock2Test {

        Clock2 clock = new Clock2(23,59,59);

        @Test
        public void  TestHour(){
            clock.setHour(23);
            assertEquals(23,clock.getHour());
        }
        @Test
        public  void TestMinute(){
            clock.setMinute(59);
            assertEquals(59,clock.getMinute());
        }
        @Test
        public  void  TestSeconds(){
            clock.setSeconds(59);
            assertEquals(59,clock.getSeconds());
        }


    }

