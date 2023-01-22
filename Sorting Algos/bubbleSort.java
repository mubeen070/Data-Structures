public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 4, 14, 23, 122, 34, 14, 2312412, 321 };
        bubble_sort(arr);
        for (int i : arr) {
            System.out.print("\t" + i);
        }
    }

    static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
