package DoublyLinkedList;

public class DoublyLinkedList<T> {

    DoublyNode head;
    DoublyNode last;
    DoublyLinkedList tail;
    int size = 0;

    public void add(T data) {
        DoublyNode<T> node = new DoublyNode<T>(data);

        if (head == null) {
            this.head = node;
            head.setPrevious(null);
        }
        else {
            DoublyNode<T> tempNode = head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node);
            node.setPrevious(tempNode);
        }
        size++;
    }

    public void remove(int index) {
        DoublyNode<T> tempNode = head;

        if (index == 0) {
            head = head.getNext();
        }
        else {
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.getNext();
            }
            DoublyNode<T> newNode = tempNode.getNext().getNext();
            tempNode.setNext(newNode);
            newNode.setPrevious(tempNode);
        }
        size--;
    }

    public void insert(int index, T data) {
        DoublyNode<T> node = new DoublyNode<T>(data);
        DoublyNode<T> tempNode = head;

        if (index == 0) {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
        else {
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            node.setPrevious(tempNode);

            tempNode.setNext(node);
            tempNode.getNext().getNext().setPrevious(node);
        }
        size++;
    }
}
