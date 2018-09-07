package SinglyLinkedList;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList<String> init() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("test0");
        list.add("test1");
        list.add("test2");
        return list;
    }

    @Test
    void testAdd() {
        SinglyLinkedList<String> list = init();

        assertEquals("test0", list.get(0));
    }

    @Test
    void testRemoveFirstElement() {
        SinglyLinkedList<String> list = init();

        list.remove(0);

        assertEquals("test1", list.get(0));
    }

    @Test
    void testRemoveMiddleElement() {
        SinglyLinkedList<String> list = init();

        list.remove(1);

        assertEquals("test0", list.get(0));
        assertEquals("test2", list.get(1));
    }

    @Test
    void testRemoveLastElement() {
        SinglyLinkedList<String> list = init();

        list.remove(2);

        assertEquals("test0", list.get(0));
        assertEquals("test1", list.get(1));
        assertNull(list.get(2));
    }

    @Test
    void testInsert() {
        SinglyLinkedList<String> list = init();

        list.insert(1, "insert");

        assertEquals("insert", list.get(1));
    }

    @Test
    void testGetSize() {
        SinglyLinkedList<String> list = init();

        assertEquals(3, list.getSize());
    }

    @Test
    void testGetTail() {
        SinglyLinkedList<String> list = init();

        SinglyLinkedList<String> result = list.getTail();

        assertEquals(2, result.getSize());
        assertEquals("test1", result.get(0));
    }

    @Test
    void testGetLast() {
        SinglyLinkedList<String> list = init();

        assertEquals("test2", list.getLast());
    }

    @Test
    void testIterate() {
        SinglyLinkedList<String> list = init();

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        list.iterate();

        assertEquals("test0\n" +
                "test1\n" +
                "test2\n", outContent.toString());
    }
}