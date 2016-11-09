package ua.edu.ucu.collections.immutable;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    private ImmutableLinkedList testLinked = new ImmutableLinkedList(null);
    private Object[] added = {1, 4, "o", "b", 8};
    public ImmutableLinkedListTest (){
        testLinked =  testLinked.addAll(added);
    }
    @Test
    public void testGetFirst(){
        int expected = 1;
        Object first = testLinked.getFirst();
        assertEquals(expected, first);}
    @Test
        public void testGetLast() {
        int expected = 8;
        Object last = testLinked.getLast();
        assertEquals(expected, last);
    }
    @Test
    public void testRemoveFirst(){
        String expected = "4,o,b,8";
        testLinked = testLinked.removeFirst();
        assertEquals(expected, testLinked.toString());}
    @Test
    public void testRemoveLast() {
        String expected = "1,4,o,b";
        testLinked = testLinked.removeLast();
        assertEquals(expected, testLinked.toString());
    }
    @Test
    public void testAdd() {
        String expected = "1,4,o,b,8,5";
        testLinked = testLinked.add(5);
        assertEquals(expected, testLinked.toString());
    }

    @Test
    public void testAdd1() {
        String expected = "1,4,o,b,8,null";
        testLinked = testLinked.add(null);
        assertEquals(expected, testLinked.toString());
    }
    @Test
    public void testAddAllEmptyList(){
        String expected = "1,4,o,b,8";
        Object[] lst = {};
        testLinked = testLinked.addAll(lst);
        assertEquals(expected, testLinked.toString());
    }

    @Test
    public void testAddAll() {
        String expected = "1,4,o,b,8,1,4,o,b,8";
        testLinked = testLinked.addAll(added);
        assertEquals(expected, testLinked.toString());
    }


    @Test
    public void testAddIndex() {
        String expected = "1,4,b,o,b,8";

        testLinked = testLinked.add(2, 'b');
        assertEquals(expected, testLinked.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllTooLargeIndex() {

        testLinked = testLinked.addAll(8, added);
    }
    @Test
    public void testAddAllIndex() {
        String expected = "1,1,4,o,b,8,4,o,b,8";
        testLinked = testLinked.addAll(1, added);
        assertEquals(expected, testLinked.toString());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveTooLargeIndex() {
        testLinked.remove(20);
    }
    @Test
    public void testRemove() {
        String expected = "1,o,b,8";

        testLinked = testLinked.remove(1);
        assertEquals(expected, testLinked.toString());
    }
    @Test
    public void testIndexOf() {
        int expected = 3;
        assertEquals(expected, testLinked.indexOf("b"));
    }
    @Test
    public void testIndexOfNotInList() {
        int expected = -1;
        assertEquals(expected, testLinked.indexOf(90));
    }
    @Test
    public void testEmptyList() {
        assertTrue(new ImmutableArrayList(null).isEmpty());

    }
    @Test
    public void testNotEmptyList() {
        assertFalse(testLinked.isEmpty());

    }
    @Test
    public void testToArray() {
        assertArrayEquals(added, testLinked.toArray());
    }
    @Test
    public void testSize(){
        assertEquals(added.length, testLinked.size());
    }
        //    @Test
//    public void testRemoveFirst() {
//        String expected = "4,o,b,8";
//        testLinked = testLinked.removeFirst();
//        assertEquals(expected, testLinked.toString());
//    }
//    @Test
//    public void testRemoveLast(){
//        String expected = "1, 4, ";
//        testLinked = testLinked.removeLast();
//        assertEquals(expected, testLinked.toString());
//
//
//    @Test
//    public void testAdd() {
//        String expected = "1,4,o,b,8,5";
//        testLinked = testLinked.addLast(5);
//        assertEquals(expected, testLinked.toString());
//    }
//    @Test
//    public void testAddFirst(){
//        String expected = "5,1,4,o,b,8";
//        testLinked = testLinked.addFirst(5);
//        assertEquals(expected, testLinked.toString());
//
//    }
//
//    @Test
//    public void testAddLast(){
//        String expected = "1,4,o,b,8,9";
//        testLinked = testLinked.addFirst(9);
//        assertEquals(expected, testLinked.toString());
//
//    }
    }