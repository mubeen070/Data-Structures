public class deQueue<T> {
    @SuppressWarnings("unchecked")
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

    public void enqueueAtTail(T value) {
        if (isFull()) {
            System.out.println("FUll");
        } else {
            tail++;
            arr[tail] = value;
        }
    }

    public T dequeueAtHead() {
        if (isEmpty()) {
            return null;
        } else {
            T value = arr[0];
            moveForward();
            return value;
        }
    }

    public T dequeueAtTail() {
        if (isEmpty()) {
            return null;
        } else {
            T value = arr[tail];
            tail--;
            return value;
        }
    }

    public void enqueueAtHead(T value) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            moveBackward();
            arr[0] = value;
        }
    }

    public void moveBackward() {
        for (int i = tail; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        tail++;
    }

    public void moveForward() {
        for (int i = 0; i < tail; i++) {
            arr[i] = arr[i + 1];
        }
        tail--;
    }
}
