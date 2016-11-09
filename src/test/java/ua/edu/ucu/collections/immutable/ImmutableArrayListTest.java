package ua.edu.ucu.collections.immutable;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    private ImmutableArrayList testArr = new ImmutableArrayList(null);
    private Object[] added = {1, 4, "o", "b", 8};
    public ImmutableArrayListTest (){
        testArr = testArr.addAll(added);
    }

    @Test
    public void testAdd() {
        String expected = "1,4,o,b,8,5";
        testArr = testArr.add(5);
        assertEquals(expected, testArr.toString());
    }

    @Test
    public void testAdd1() {
        String expected = "1,4,o,b,8,null";
        testArr = testArr.add(null);
        assertEquals(expected, testArr.toString());
    }

    @Test
    public void testAddAllEmptyList() {
        String expected = "1,4,o,b,8";
        Object[] lst = {};
        testArr = testArr.addAll(lst);
        assertEquals(expected, testArr.toString());
    }

    @Test
    public void testAddAll() {
        String expected = "1,4,o,b,8,1,4,o,b,8";
        testArr = testArr.addAll(added);
        assertEquals(expected, testArr.toString());
    }

    @Test
    public void testAddAllTheSame() {
        String expected = "1,4,o,b,8,1,1,1,1,1,1,1";
        Object[] lst1 = {1, 1, 1, 1, 1, 1, 1};
        testArr = testArr.addAll(lst1);
        assertEquals(expected, testArr.toString());
    }

    @Test
    public void testAddIndex() {
        String expected = "a,1,4,o,b,8";

        testArr = testArr.add(0, 'a');
        assertEquals(expected, testArr.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllTooLargeIndex() {
        testArr = testArr.addAll(7, added);
    }
    @Test
    public void testAddAllIndex() {
        String expected = "1,1,4,o,b,8,4,o,b,8";
        testArr = testArr.addAll(1, added);
        assertEquals(expected, testArr.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveTooLargeIndex() {
        testArr.remove(50);
    }
    @Test
    public void testRemove() {
        String expected = "1,o,b,8";

        testArr = testArr.remove(1);
        assertEquals(expected, testArr.toString());
    }
    @Test
    public void testIndexOfIsInList() {
        int expected = 1;
        assertEquals(expected, testArr.indexOf(4));
    }
    @Test
    public void testIndexOfNotInList() {
        int expected = -1;
        assertEquals(expected, testArr.indexOf(90));
    }
    @Test
    public void testEmptyList() {
        assertTrue(new ImmutableArrayList(null).isEmpty());

    }
    @Test
    public void testNotEmptyList() {
        assertFalse(testArr.isEmpty());

    }
    @Test
    public void testToArray() {
        assertArrayEquals(added, testArr.toArray());
    }
}