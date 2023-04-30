//Binary Search Tree

public class binaryT {
    class Node {
        int data;
        Node left;
        Node right;
    }

    Node root = null;

    private boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    public Node insertRec(Node root, int value) {
        if (root == null) {
            Node n = new Node();
            n.data = value;
            root = n;
        } else if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        } else {
            if (root.data == key) {
                return true;
            } else if (key < root.data) {
                return searchRec(root.left, key);
            } else {
                return searchRec(root.right, key);
            }
        }
    }

    public Node delete(int key) {
        root = deleteRec(root, key);
        return root;
    }

    public Node deleteRec(Node root, int key) {
        if (isEmpty()) {
            System.out.println("Empty!");
        } else if (root.data > key) {
            root.left = deleteRec(root.left, key);
        } else if (root.data < key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = successor(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    public int successor(Node n) {
        int successor = n.data;
        Node t = n;
        while (t.left != null) {
            successor = t.left.data;
        }
        return successor;
    }

    public void inOrder() {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root == this.root) {
            System.out.print("InOrder: ");
        }
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " -> ");
            inOrderRec(root.right);
        }
    }
}