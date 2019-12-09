package Tree;

public class Node {
    int value;

     Node rightNode;

     Node LeftNode;

    public Node(int value) {
        this.value = value;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return LeftNode;
    }

    public void setLeftNode(Node leftNode) {
        LeftNode = leftNode;
    }

    public void frontShow() {
        System.out.println(value);
        if(LeftNode!=null){
            LeftNode.frontShow();
        }
        if(rightNode!=null){
            rightNode.frontShow();
        }
    }

    public void mediumShow() {
        if(LeftNode!=null){
            LeftNode.mediumShow();
        }
        System.out.println(value);
        if(rightNode!=null){
            rightNode.mediumShow();
        }
    }

    public void lastShow() {
        if(LeftNode!=null){
            LeftNode.lastShow();
        }
        if(rightNode!=null){
            rightNode.lastShow();
        }
        System.out.println(value);
    }

    public Boolean frontSearch(int i) {
        Boolean target=null;
        if(i==value){
            target= true;
        }else{
            if(LeftNode!=null){
                target=LeftNode.frontSearch(i);
            }else{
                if(rightNode!=null){
                    target=rightNode.frontSearch(i);
                }
            }
        }
        return target;
    }
    public void deleteNode(int i){
        Node parent=this;
        if(parent.LeftNode!=null&&parent.LeftNode.value==i){
            parent.LeftNode=null;
            return;
        }
        if(parent.rightNode!=null&&parent.rightNode.value==i){
            parent.rightNode=null;
            return;
        }
        parent=LeftNode;
        if(parent!=null){
            parent.deleteNode(i);
        }
        parent=rightNode;
        if(parent!=null){
            parent.deleteNode(i);
        }
    }

}
