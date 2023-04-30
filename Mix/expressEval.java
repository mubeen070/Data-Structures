import java.util.*;

public class expressEval {

    public static void main(String[] args) {
        String s = "+-3*/4";
        double res = converttoprefix(s);
        System.out.println(res);
    }

    public static double converttoprefix(String exp) {
        Stack<Double> st = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                double d;
                d = Character.getNumericValue(ch);
                st.push(d);
            } else {
                switch (ch) {
                    case '+': {
                        double num1 = st.pop();
                        double num2 = st.pop();
                        st.push(num1 + num2);
                        break;
                    }
                    case '-': {

                        double num1 = st.pop();
                        double num2 = st.pop();
                        st.push(num1 - num2);
                        break;
                    }
                    case '*': {

                        double num1 = st.pop();
                        double num2 = st.pop();
                        st.push(num1 * num2);
                        break;
                    }
                    case '/': {

                        double num1 = st.pop();
                        double num2 = st.pop();
                        st.push(num1 / num2);
                        break;
                    }

                }
            }
        }
        return st.peek();
    }
}