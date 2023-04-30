public class linkedlist2<T> {

    class Node {
        Node next;
        T data;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node start = null;

    public void insertAtStart(T value) {
        Node n = new Node(value);
        if (start == null) {
            start = n;
        } else {
            n.next = start;
            start = n;
        }
    }

    public void insertAtEnd(T value) {
        Node n = new Node(value);
        Node t1 = start;
        while (t1.next != null) {
            t1 = t1.next;
        }
        t1.next = n;
    }

    public void insertAfter(T key) {
        Node n = new Node(key);
        Node t = start;

        while (t.next != null) {
            if (t.data == key) {
                n.next = t.next;
                t.next = n;
                return;
            }
            t = t.next;
        }
    }

    public T deleteAtStart() {
        if (start == null) {
            System.out.println("Empty!");
            return null;
        } else {
            T data = start.data;
            start = null;
            return data;
        }
    }

    public T deleteAtEnd() {
        if (start == null) {
            System.out.println("Empty!");
            return null;
        } else {
            Node t1, t2;
            t2 = null;
            t1 = start;
            while (t1.next != null) {
                t1 = t1.next;
                t2 = t1;
            }
            T value = t1.data;
            t2.next = null;
            return value;
        }
    }
}
