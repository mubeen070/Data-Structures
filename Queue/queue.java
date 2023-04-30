@SuppressWarnings("unchecked")
public class queue<T> {
    T[] arr = (T[]) new Object[10];
    int tail = -1, head = -1;

    public boolean isFull() {
        if (tail == arr.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (tail == head) {
            return true;
        }
        return false;
    }

    public T peek() {
        if (isFull()) {
            return null;
        } else {
            return arr[head + 1];
        }
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("FUll");
        } else {
            tail++;
            arr[tail] = value;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            head++;
            return arr[head];
        }
    }

    public int size() {
        return tail - head;
    }
}