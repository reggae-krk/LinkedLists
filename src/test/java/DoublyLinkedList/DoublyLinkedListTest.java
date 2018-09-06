package DoublyLinkedList;

import org.junit.jupiter.api.Test;

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

}