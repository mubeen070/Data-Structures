
public class factorial {
    public static void main(String[] args) {
        System.out.println(xfactorial(5));
    }

    static int xfactorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * xfactorial(x - 1);
        }
    }
}
