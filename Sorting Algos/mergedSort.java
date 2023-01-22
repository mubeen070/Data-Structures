
public class mergedSort {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 1, 14, 23, 122, 34, 123, 4124, 321 };
        merged_Sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print("\t" + i);
        }

    }

    public static void merged_Sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merged_Sort(arr, low, mid);
            merged_Sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] merged = new int[arr.length];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merged[k++] = arr[i++];
        }
        while (j <= high) {
            merged[k++] = arr[j++];
        }
        for (i = high; i >= low; i--) {
            arr[i] = merged[--k];
        }
    }
}
