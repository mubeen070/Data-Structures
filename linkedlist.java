public class linkedlist<T> {
    Node start;
    Node end;
    int size =0;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
            return;
        }
        newNode.next = start;
        size++;
        start = newNode;

    }

    public void addLast(T value) {
        Node n = new Node(value);
        if (start == null) {
            start = n;
            return;
        }
        Node t = start;
        while (t.next != null) {
            t = t.next;
        }
        size++;
        t.next = n;

    }

    public void printList() {
        Node t = start;
        while (t != null) {
            System.out.print("\t" + t.data + "\t--->");
            t = t.next;
        }
        System.out.print("\tNULL");
    }

    public void addBetween(T key, T data) {
        Node t = start;
        while (t.next != null) {
            if (t.data == key) {
                Node n = new Node(data);
                n.next = t.next;
                t.next = n;
            }
            size++;
            t = t.next;
        }
    }

    public void deleteStart(){
        if(start == null){
            System.out.println("empty");
            return;
        }
        size--;
       start = start.next;
            
        
    }
    public void deleteEnd(){
        if(start == null){
            System.out.println("empty");
            return;
        }
        size--;
        if(start == null){
            start.next = null;
            return;
        }
        Node secondLast = start;
        Node last = start.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        linkedlist<Integer> l1 = new linkedlist<Integer>();
        l1.addFirst(110);
        l1.addLast(230);
        l1.printList();
        System.out.println("\n");
        l1.addBetween(110, 10);
        l1.deleteStart();
        l1.deleteEnd();
        l1.printList();
        System.out.println("\n");
        System.out.println("Size: "+l1.getSize());
    }
}