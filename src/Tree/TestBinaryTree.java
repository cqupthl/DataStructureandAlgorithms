package Tree;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();

        Node root=new Node(1);
        Node rightNode=new Node(3);
        Node leftNode=new Node(2);

        binaryTree.setRoot(root);
        root.setLeftNode(leftNode);
        root.setRightNode(rightNode);
        rightNode.setLeftNode(new Node(6));
        rightNode.setRightNode(new Node(7));

        leftNode.setLeftNode(new Node(4));
        leftNode.setRightNode(new Node(5));

   //     binaryTree.frontShow();  //前序遍历
    //    binaryTree.mediumShow();   //中序遍历
      //  binaryTree.lastShow();    //后序遍历
        System.out.println(binaryTree.frontSearch(5));
        binaryTree.delete(3);
        binaryTree.frontShow();
    }
}
