package Tree.ArrayBinaryTree;

/**
 * @ClassName ArrayBinaryTree
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/1
 * @Version V1.0
 **/
public class ArrayBinaryTree {
    int []data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow(int index){
        if(this.data==null||this.data.length==0){
            return;
        }else{
            System.out.println(data[index]);
            if((index*2+1)<data.length){
               frontShow(index*2+1);
            }
            if((index*2+2)<data.length){
               frontShow(index*2+2);
            }
        }
    }
}
