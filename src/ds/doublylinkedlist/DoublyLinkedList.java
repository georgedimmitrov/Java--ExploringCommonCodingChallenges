package ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }

        newNode.next = first;
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }

        last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;

        if (first.next == null) {
            // only 1 item in the list
            last = null;
        } else {
            first.next.previous = null;
        }

        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;

        if (first.next == null) {
            // only 1 item in the list
            first = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data) {
        Node current = first;

        while (current.data != key) {
            current = current.next;

            if (current == null) {
                // we are at the end of the list
                return false;
            }
        }

        Node newNode = new Node(data);

        if (current == last) {
//            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }

        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    public Node deleteKey(int key) {
        Node current = first;

        while (current.data != key) {
            current = current.next;

            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next; // since current is about to be deleted
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous; // current is about to be deleted
        } else {
            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForward() {
        System.out.println("List (first --> last) ");

        Node current = first;

        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List (last --> first) ");

        Node current = last;

        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }
}
