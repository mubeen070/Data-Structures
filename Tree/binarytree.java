public class binarytree {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    Node root = null;

    public void insertRoot(int value) {
        if (root == null) {
            root = new Node(value);
        } else
            return;
    }

    public void insertLeft(Node n, int value) {
        if (n.left == null) {
            n.left = new Node(value);
        } else {
            System.out.println("full");
            return;
        }
    }

    public void insertRight(Node n, int value) {
        if (n.right == null) {
            n.right = new Node(value);
        } else {
            System.out.println("full");
            return;
        }
    }

    public void inOrderTraversal(Node n) {
        if (n != null) {
            inOrderTraversal(n.left);
            System.out.println(n.data + " ");
            inOrderTraversal(n.right);
        }
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
            System.out.print("InOrder=>");
        }
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + "=>");
            inOrderRec(root.right);
        }
}
