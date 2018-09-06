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
}
