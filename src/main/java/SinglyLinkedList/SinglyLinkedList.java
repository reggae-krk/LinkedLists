package SinglyLinkedList;

public class SinglyLinkedList<T> {

    SinglyNode head;
    SinglyNode last;
    SinglyLinkedList tail;
    int size = 0;

    public void add(T data) {
        SinglyNode<T> node = new SinglyNode<T>(data);

        if (head == null) {
            this.head = node;
        }
        else {
            SinglyNode<T> tempNode = head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node);
        }
        size++;
    }

    public void remove(int index) {
        SinglyNode<T> tempNode = head;

        if (index == 0) {
            head = head.getNext();
        }
        else {
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
        size--;
    }

    public void insert(int index, T data) {
        SinglyNode<T> node = new SinglyNode<T>(data);
        SinglyNode<T> tempNode = head;

        if (index == 0) {
            node.setNext(head);
            head = node;
        }
        else {
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public SinglyLinkedList getTail() {
        SinglyNode<T> node = head.getNext();
        tail = new SinglyLinkedList<T>();
        tail.add(node.getData());

        while (node.getNext() != null) {
            tail.add(node.getNext().getData());
            node = node.getNext();
        }
        return tail;
    }
}
