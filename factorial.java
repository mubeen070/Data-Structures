import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int res = Factorial1(3);
        System.out.println(res);
    }
    public static int Factorial1(int n){
        Stack<Integer> s = new Stack<Integer>();
        int op = n-1;
        while(n>=1){
            s.push(n);
            n--;
        }
        while(op!=0){
            int b= s.pop();
            int a= s.pop();
            s.push(a*b);
            op--;
        }
        return s.pop();
    }
}
