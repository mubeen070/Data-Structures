public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 4, 14, 23, 122, 34, 14, 2312412, 321 };
        insertion_sort(arr);
        for (int i : arr) {
            System.out.print("\t" + i);
        }
    }

    public static void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > value) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = value;
        }
    }
}
