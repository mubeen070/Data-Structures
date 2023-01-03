import java.util.*;

class bfs {
    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(this);
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                array.add(current.name);
                for (Node child : current.children) {
                    queue.add(child);
                }
            } 
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static void main(String[] args) {
        Node test = new Node("A");
        test.addChild("B").addChild("C");
        test.children.get(0).addChild("D");
        System.out.println(test.breadthFirstSearch(new ArrayList<>()));
    }
}
