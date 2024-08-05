class Node {
    int info;
    Node link;

    public Node(int data) {
        this.info = data;
        this.link = null;
    }
}

public class Lab10_56 {
    public static void main(String[] args) {
        Node node = new Node(23);
        System.out.println("Data in the node: " + node.info);
    }
}