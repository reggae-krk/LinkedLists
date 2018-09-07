package DoublyLinkedList;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList<String> init() {
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.add("test0");
        list.add("test1");
        list.add("test2");
        return list;
    }

    @Test
    void testAdd() {
        DoublyLinkedList<String> list = init();

        assertEquals("test0", list.getData(0));
    }

    @Test
    void testRemoveFirstElement() {
        DoublyLinkedList<String> list = init();

        list.remove(0);

        assertEquals("test1", list.getData(0));
    }

    @Test
    void testRemoveMiddleElement() {
        DoublyLinkedList<String> list = init();

        list.remove(1);

        assertEquals("test0", list.getData(0));
        assertEquals("test2", list.getData(1));
    }

    @Test
    void testRemoveLastElement() {
        DoublyLinkedList<String> list = init();

        list.remove(2);

        assertEquals("test0", list.getData(0));
        assertEquals("test1", list.getData(1));
        assertNull(list.getData(2));
    }

    @Test
    void testRemoveFirstElementAndCheckPreviousAndNextAddress() {
        DoublyLinkedList<String> list = init();

        list.remove(0);

        assertEquals("test2", list.getNode(0).getNext().getData());
        assertNull(list.getNode(0).getPrevious());
    }

    @Test
    void testRemoveMiddleElementAndCheckPreviousAndNextAddress() {
        DoublyLinkedList<String> list = init();

        list.remove(1);

        assertEquals("test2", list.getNode(0).getNext().getData());
        assertEquals("test0", list.getNode(1).getPrevious().getData());
    }

    @Test
    void testRemoveLastElementAndCheckPreviousAndNextAddress() {
        DoublyLinkedList<String> list = init();

        list.remove(2);

        assertEquals("test0", list.getNode(1).getPrevious().getData());
        assertNull(list.getNode(1).getNext());
    }

    @Test
    void testInsert() {
        DoublyLinkedList<String> list = init();

        list.insert(1, "insert");

        assertEquals("insert", list.getData(1));
    }

    @Test
    void testGetSize() {
        DoublyLinkedList<String> list = init();

        assertEquals(3, list.getSize());
    }

    @Test
    void testGetTail() {
        DoublyLinkedList<String> list = init();

        DoublyLinkedList<String> result = list.getTail();

        assertEquals(2, result.getSize());
        assertEquals("test1", result.getData(0));
    }

    @Test
    void testGetLast() {
        DoublyLinkedList<String> list = init();

        assertEquals("test2", list.getLast());
    }

    @Test
    void testIterate() {
        DoublyLinkedList<String> list = init();

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        list.iterate();

        assertEquals("test0\n" +
                "test1\n" +
                "test2\n", outContent.toString());
    }
}