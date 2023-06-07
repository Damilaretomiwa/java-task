package stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void testThatAnElementCanBePushedToSTackTest(){
        Stack stack = new Stack();
        //given we have a stack
        stack.push("tomiwa");
        //check that element can be pushed to stack
        assertEquals(1, stack.checkStack());
    }

    @Test
    public void testThatAnElementCanBePushedAndPoppedFromAStack(){
        Stack stack = new Stack();
        //given we have a stack
        stack.push("Bright");
        stack.push("tomiwa");
        stack.push("john");
        //given that an element can be pushed to stack
        stack.pop();
        stack.pop();
        assertEquals(1,stack.checkStack());
    }
}