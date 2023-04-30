public class treeArray<T> {

    T[] arr;

    @SuppressWarnings("unchecked")
    public treeArray(int a) {
        arr = (T[]) new Object[a];
    }

    public boolean isEmpty() {
        if (arr[1] == null) {
            return true;
        }
        return false;
    }

    public void insertRoot(T value) {
        if (isEmpty()) {
            arr[1] = value;
        } else {
            System.out.println("already exists");
        }
    }

    public void inserLeft(T key, T value) {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            int i = search(key);
            if (i != 0) {
                arr[2 * i] = value;
            } else {
                System.out.println("Node not found");
            }
        }
    }

    public void inserRight(T key, T value) {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            int i = search(key);
            if (i != 0) {
                arr[2 * i + 1] = value;
            } else {
                System.out.println("Node not found");
            }
        }
    }

    public int search(T key) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return 0;
    }
}
