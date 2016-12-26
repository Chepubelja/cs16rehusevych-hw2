package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPeek() {
        Stack lst = new Stack(new Object[]{1, 2, 3});
        Object expResult = 3;
        Object actualResult = lst.peek().getData();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testPopFrom() {
        Stack lst = new Stack(new Object[]{1, 2, 3});
        Object expResult = "1,2";
        lst.pop();
        Object actualResult = lst.stack;
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testPopTo() {
        Stack lst = new Stack(new Object[]{1, 2, 3, 4, 5});
        Object expResult = "1,2,3,4,5,7";
        lst.pop(7);
        Object actualResult = lst.stack;
        assertEquals(expResult, actualResult);
    }
}
