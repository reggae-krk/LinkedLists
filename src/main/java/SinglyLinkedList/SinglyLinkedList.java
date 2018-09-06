package SinglyLinkedList;

public class SinglyLinkedList<T> {

    SinglyNode head;
    SinglyNode last;
    SinglyNode tail;
    int length;

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
    }
}
