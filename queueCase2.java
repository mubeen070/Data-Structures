@SuppressWarnings("unchecked")
public class queueCase2<T> {
    T[] arr = (T[]) new Object[10];
    int tail = -1, head = -1;

    public boolean isFull() {
        if (tail == arr.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (tail == -1) {
            return true;
        }
        return false;
    }

    public T peek() {
        if (isFull()) {
            return null;
        }
        return arr[0];
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            T value = arr[0];
            moveForward();
            return value;
        }
    }

    public void moveForward() {
        for (int i = 0; i < tail; i++) {
            arr[i] = arr[i + 1];
        }
        tail--;
    }
}
