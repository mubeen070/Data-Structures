public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 10, 14, 14, 23, 34, 122, 321, 2312412 };
        int result = binary_search(arr, 0, arr.length - 1, 2312412);
        System.out.print("Key found at " + result + " index.");
    }

    static int binary_search(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binary_search(arr, low, mid - 1, key);
            } else {
                return binary_search(arr, mid + 1, high, key);
            }
        }
        return -1;
    }

}
