package Tree.ArrayBinaryTree;

/**
 * @ClassName TestArrayBinaryTree
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/1
 * @Version V1.0
 **/
public class TestArrayBinaryTree {
    public static void main(String[] args) {
      int[] data=new int[]{1,2,3,4,5,6,7};
      ArrayBinaryTree arrayBinaryTree=new ArrayBinaryTree(data);
        arrayBinaryTree.frontShow(0);
    }
}
