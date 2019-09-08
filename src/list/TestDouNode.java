package list;

public class TestDouNode {
    public static void main(String[] args) {
        DouList douList=new DouList();
    for(int i=0;i<6;i++){
        douList.addNode(i);
    }
    douList.insertNode(5,6);
    douList.printNode();
    }

}
