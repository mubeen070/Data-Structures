import java.util.*;

public class stack {
public static void main(String[] args) {
    int item;
    Stack<Integer> st= new Stack<Integer>();
    st.push(50);
    st.push(15);
    item = st.pop();
    System.out.println(item);
    st.push(11);
    item = st.pop();
    System.out.println(item);
    st.push(43);
    st.push(34);
    item = st.pop();
    System.out.println(item);
    item = st.pop();
    System.out.println(item);

    System.out.println(st.peek());
}


}
