

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 1, 14, 23, 122, 34, 14, 2312412, 321 };
        selection_sort(arr);
        for (int i : arr) {
            System.out.print("\t" + i);
        }
    }

    public static void selection_sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
