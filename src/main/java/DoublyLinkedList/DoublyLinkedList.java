package DoublyLinkedList;

public class DoublyLinkedList<T> {

    DoublyNode head;
    DoublyNode last;
    DoublyLinkedList tail;
    int size = 0;

    public DoublyNode getNode(int index) {
        DoublyNode<T> node = head;

        for (int i = 0; i < size; i++) {
            if (i == index) {
                return node;
            }
            else node = node.getNext();
        }
        return null;
    }

    public T getData(int index) {
        DoublyNode<T> node = head;

        for (int i = 0; i < size; i++) {
            if (i == index) {
                return node.getData();
            }
            else node = node.getNext();
        }
        return null;
    }

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
            head.setPrevious(null);
        }
        else if (index != size - 1) {
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.getNext();
            }
            DoublyNode<T> newNode = tempNode.getNext().getNext();
            tempNode.setNext(newNode);
            newNode.setPrevious(tempNode);
        }
        else {
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            DoublyNode<T> newNode = tempNode.getPrevious();
            newNode.setNext(null);
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

    public int getSize() {
        return size;
    }

    public DoublyLinkedList getTail() {
        DoublyNode<T> node = head.getNext();
        node.setPrevious(null);
        tail = new DoublyLinkedList<T>();
        tail.add(node.getData());

        while (node.getNext() != null) {
            tail.add(node.getNext().getData());
            node = node.getNext();
        }
        return tail;
    }

    public T getLast() {
        DoublyNode<T> node = head;
        for (int i = 0; i < size - 1; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    public void iterate() {
        DoublyNode<T> node = head;
        while (node.getNext() != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println(node.getData());
    }
}
