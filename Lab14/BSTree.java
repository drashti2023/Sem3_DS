import java.util.*;
class Node{
    int key;
    Node left;
    Node right;

    public Node(int data){
        key = data;
        left = null;
        right = null;
    }
}
class BinarySearchTree{
    Node root;

    public BinarySearchTree(){
        root = null;
    }

    //Insertion 
    void insert(int key){
        root = insertRecord(root , key);
    }
    Node insertRecord(Node root , int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertRecord(root.left , key);
        }else if(key > root.key){
            root.right = insertRecord(root.right , key);
        }
        return root;
    }

    //Inorder Traversal
    void inorder(){
        inorderRecord(root);
        System.out.println();
    }
    void inorderRecord(Node root){
        if (root != null) {
            inorderRecord(root.left);
            System.out.print(root.key + " ");
            inorderRecord(root.right);
            
        }
    }

    //Search Operation
    boolean search(int key){
        return searchRecord(root , key);
    }
    boolean searchRecord(Node root , int key){
        if(root == null){
            return false;
        }else if(root.key == key){
            return true;
        }
        return key < root.key ? searchRecord(root.left , key): searchRecord(root.right , key);
        
    }
}
public class BSTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            System.out.println("Enter value for node "+(i+1)+":");
            int value = sc.nextInt();
            tree.insert(value);
        }
        System.out.println("Inorder traversal of BST:");
        tree.inorder();

        int searchKey = 8;
        System.out.println("\nIs "+searchKey+ " present in tree? "+ tree.search(searchKey));
    }
    
}
