
public class queuemain {
    public static void main(String[] args) {
        int item;
        queue<Integer> q1 = new queue<>();
        q1.enqueue(50);
        q1.enqueue(15);
        item = q1.dequeue();
        System.out.println(item);
        q1.enqueue(11);
        item = q1.dequeue();
        System.out.println(item);
        q1.enqueue(43);        
        q1.enqueue(34);
        item = q1.dequeue();
        System.out.println(item);
        item = q1.dequeue();
        System.out.println(item);
        
        System.out.println(q1.peek());
    }

    
}
