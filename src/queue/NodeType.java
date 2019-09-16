package queue;

public class NodeType {
    int data;
    NodeType next;

    public NodeType() {
    }

    public NodeType(int data) {
        this.data = data;
    }

    public NodeType(int data, NodeType next) {
        this.data = data;
        this.next = next;
    }
}
