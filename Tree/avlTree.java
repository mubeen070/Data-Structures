public class avlTree {
    class Node {
        int data;
        int height;
        Node left, right;

        Node(int d){
            this.data=d;
            this.height = 1;
        }
    }
    Node root;

    public int height(Node n){
            if(n == null){
                return 0;
            }
            return n.height;
    }
}