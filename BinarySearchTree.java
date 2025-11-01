// Java implementation of a Binary Search Tree (BST)

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Insert a new key
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive insert function
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    // Inorder traversal
    void inorder() {
        inorderRec(root);
    }

    // Recursive inorder function
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Search a key in BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (root.key == key) return true;
        if (key < root.key)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Print inorder traversal
        System.out.println("Inorder traversal:");
        bst.inorder();

        // Search for a key
        int keyToSearch = 60;
        System.out.println("\nSearch " + keyToSearch + ": " + bst.search(keyToSearch));
    }
}