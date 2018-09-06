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
}