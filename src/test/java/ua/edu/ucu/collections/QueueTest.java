package ua.edu.ucu.collections;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class QueueTest {

    @Test
    public void testPeek() {
        Queue lst = new Queue(new Object[]{5, 2, 5, 1});
        Object actualResult = lst.peek().getData();
        Object expResult = "5";
        assertEquals(expResult, actualResult);
    }
    @Test
    public void testEnqueue() {
        Queue lst = new Queue(new Object[]{1, 2, 3});
        lst.enqueue(4);
        Object expResult = "1,2,3,4";
        Object actualResult = lst.queue;
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testDequeue() {
        Queue lst = new Queue(new Object[]{1, 2, 3, 4, 5});
        Object expResult = "2,3,4,5";
        lst.dequeue();
        Object[] actualResult = new Object[]{lst.queue};
        assertEquals(expResult, actualResult);
    }

}
