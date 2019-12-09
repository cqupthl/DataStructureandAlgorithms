package Tree;

public class BinaryTree {

    Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void frontShow() {
        root.frontShow();
    }

    public void mediumShow() {
        root.mediumShow();
    }

    public void lastShow() {
        root.lastShow();
    }

    public Boolean frontSearch(int i) {
      return root.frontSearch(i);
    }
    public void delete(int i){
        if (root.value==i){
            root=null;
        }else{
            root.deleteNode(i);
        }
    }
}
