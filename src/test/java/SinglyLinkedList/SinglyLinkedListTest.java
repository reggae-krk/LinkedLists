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

}