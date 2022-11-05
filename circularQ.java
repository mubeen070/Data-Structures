@SuppressWarnings("unchecked")
public class circularQ<T> {
    int n = 10;
    T[] array = (T[]) new Object[n];
    int tail = -1;
    int head = -1;

    public boolean isFull() {
        if (head + n == tail) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (head == tail) {
            return true;
        }
        return false;
    }

    public int size() {
        return head - tail;
    }

    public void inQueue(T value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            tail++;
            array[tail%n] = value;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else
            head++;
        return array[head%n];
    }
}
