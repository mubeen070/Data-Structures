public class binaryTreemain {
    public static void main(String[] args) {
        binarytree n = new binarytree();
        n.insertRoot(10);
        n.insertLeft(n.root, 4);
        n.insertRight(n.root, 29);
        n.insertLeft(n.root.left, 20);
        n.insertRight(n.root.left, 78);
        n.insertLeft(n.root.right, 24);
        n.inOrderTraversal(n.root);
    }
}
