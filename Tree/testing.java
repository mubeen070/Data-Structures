public class testing {
    public static void main(String[] args) {
        binaryT ob1 = new binaryT();

        ob1.insert(40);
        ob1.insert(10);
        ob1.insert(20);
        ob1.insert(30);

        ob1.inOrder();
        ob1.delete(20);
        System.out.println("");
        ob1.inOrder();
    }
}
