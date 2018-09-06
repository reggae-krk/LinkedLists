package SinglyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void testAdd() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("test");

        assertEquals("test", list.get(0));
    }

    @Test
    void testRemoveFirstElement() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("test0");
        list.add("test1");

        list.remove(0);

        assertEquals("test1", list.get(0));
    }

    @Test
    void testRemoveMiddleElement() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("test0");
        list.add("test1");
        list.add("test2");

        list.remove(1);

        assertEquals("test0", list.get(0));
        assertEquals("test2", list.get(1));
    }

    @Test
    void testRemoveLastElement() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("test0");
        list.add("test1");
        list.add("test2");

        list.remove(2);

        assertEquals("test0", list.get(0));
        assertEquals("test1", list.get(1));
    }

    @Test
    void testInsert() {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("test0");
        list.add("test1");

        list.insert(1, "insert");

        assertEquals("insert", list.get(1));
    }
}