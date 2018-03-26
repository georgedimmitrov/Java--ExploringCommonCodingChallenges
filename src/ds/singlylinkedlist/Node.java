package ds.singlylinkedlist;

public class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.println(" { " + this.data + " } ");
    }
}
