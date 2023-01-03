public class singLinkedList<T> {

    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node start = null;
    Node end = null;

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
        Node t = start;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    public void insertAfter(T value, T key) {
        Node t = start;
        while (t.next != null) {
            if (t.data == key) {
                Node n = new Node(value);
                n.next = t.next;
                t.next = n;
                return;
            }
            t = t.next;
        }
        System.out.println("Key not found!");
    }

    public T deleteAtStart(){
        if(start == null){
            System.out.println("Empty");
            return null;
        }
        else{
            T value = start.data;
            start = start.next;
            return value;
        }
    }
    public T deleteAtEnd(){
        if(start == null){
            System.out.println("empty!");
            return null;
        }
        else{
            Node t1 = start;
            Node t2 = null;
            while (t1.next!=null){
                t2 = t1;
                t1 = t1.next;
            }
            T value = t1.data;
            t2.next = null;
            return value;
        }
    }
}
