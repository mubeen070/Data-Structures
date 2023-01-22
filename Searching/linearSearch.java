public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 4, 14, 23, 122, 34, 14, 2312412, 321 };

        System.out.print(linear_search(arr, 10));

    }

    static int linear_search(int[] arr, int key) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.print("Found:  ");
                return arr[i];
            }
        }
        System.out.print("Not found! ");
        return -1;
    }
}
