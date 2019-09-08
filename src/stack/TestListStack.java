package stack;

public class TestListStack {
    public static void main(String[] args) {
        ListStack listStack=new ListStack();
        listStack.push(1);
        listStack.push(2);
        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
    }
}
