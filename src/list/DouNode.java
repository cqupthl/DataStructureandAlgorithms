package list;

public class DouNode {
    DouNode pre;//前驱节点
    DouNode next;//后继节点
    int data;

    public DouNode(int data) {
        this.data = data;
    }

    public DouNode getPre() {
        return pre;
    }

    public void setPre(DouNode pre) {
        this.pre = pre;
    }

    public DouNode getNext() {
        return next;
    }

    public void setNext(DouNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
