package ds.doublylinkedlist;

public class Node {
    public int data;
    public Node next;
    public Node previous;

    public Node(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.print(" { " + this.data + " } ");
    }
}
