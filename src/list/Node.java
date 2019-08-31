package list;

public class Node {
    Node next=null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int toData(){
        return data;
    }

}
