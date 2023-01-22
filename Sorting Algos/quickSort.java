public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 1, 14, 23, 122, 34, 14, 2312412, 321 };
        quick_sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print("\t" + i);
        }
    }

    public static void quick_sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        int pivot = arr[mid];
        int i = low, j = high;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quick_sort(arr, low, j);
        quick_sort(arr, i, high);
    }
}
