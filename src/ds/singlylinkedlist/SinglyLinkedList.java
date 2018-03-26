package ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first;

    public boolean isEmpty() {
        return (first == null);
    }

    // insert at beginning of list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node current = first;

        while (current.next != null) {
            current = current.next;
        }

        Node newNode = new Node(data);
        current.next = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");

        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
