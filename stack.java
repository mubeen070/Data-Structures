public class stack<T> {

    T[] arr = (T[]) new Object[10];
    int top = -1;

    private boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if (top == (arr.length - 1)) {
            return true;
        }
        return false;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = value;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else 

            T value = arr[top];
            top--;
            
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else
            return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        for (int i = top; i > arr.length; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        stack<Integer> s1 = new stack<Integer>();
        s1.push(10);
        s1.push(13);
        s1.print();
    }
}
