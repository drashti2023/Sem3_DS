import java.util.Scanner;
class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class SinglyLinkedList {
    public Node first;

    SinglyLinkedList() {
        this.first = null;
    }

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.link = first;
        first = newNode;
    }

    void display() {
        Node save = first;
        while (save != null) {
            System.out.print(save.data + " ");
            save = save.link;
        }
        System.out.println();
    }

    void deleteFirstNode() {
        if (first != null) {
            first = first.link;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newNode;
        }
    }

    void deleteLastNode() {
        if (first == null || first.link == null) {
            first = null;
        } else {
            Node save = first;
            while (save.link.link != null) {
                save = save.link;
            }
             save.link = null;
        }
    }

    void deleteNodeAtPosition(int position) {
        if (first == null) {
            return;
        }
        if (position == 0) {
            first = first.link;
        } else {
            Node save = first;
            for (int i = 0; save != null && i < position - 1; i++) {
                save = save.link;
            }
            if (save == null || save.link == null) {
                return;
            }
            save.link = save.link.link;
        }
    }
}

public class Lab10_57 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int x, position;
        boolean flag = true;

        while(flag){
            System.out.println("\nSingly Linked List Operations:");
            System.out.println("1. Insert at Front");
            System.out.println("2. Display All Nodes");
            System.out.println("3. Delete First Node");
            System.out.println("4. Insert at End");
            System.out.println("5. Delete Last Node");
            System.out.println("6. Delete Node at Position");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at front: ");
                    x = sc.nextInt();
                    list.insertAtFront(x);
                    break;
                case 2:
                    System.out.println("Nodes in the linked list:");
                    list.display();
                    break;
                case 3:
                    list.deleteFirstNode();
                    System.out.println("First node deleted.");
                    break;
                case 4:
                    System.out.print("Enter data to insert at end: ");
                    x = sc.nextInt();
                    list.insertAtEnd(x);
                    break;
                case 5:
                    list.deleteLastNode();
                    System.out.println("Last node deleted.");
                    break;
                case 6:
                    System.out.print("Enter position to delete node: ");
                    position = sc.nextInt();
                    list.deleteNodeAtPosition(position);
                    break;
                case 0:
                    flag = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}