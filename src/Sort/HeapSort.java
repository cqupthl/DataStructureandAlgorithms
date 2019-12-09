package Sort;

import java.util.Arrays;

/**
 * 堆排序
 * @ClassName HeapSort
 * @Description: TODO
 * @Author hl
 * @Date 2019/12/1
 * @Version V1.0
 **/
public class HeapSort {
    public static void main(String[] args) {
        int data[]=new int[]{9,6,8,7,0,1,10,4,2};
        heapSort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void heapSort(int[] arr){
        int start=(arr.length-2)/2;
        for(int i=start;i>=0;i--){
            maxHeap(arr,i,arr.length);
        }
        for(int i=arr.length-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxHeap(arr,0,i);
        }
    }

    public static void maxHeap(int[] arr,int index,int size){
        int leftNode=index*2+1;
        int rightNode=index*2+2;
        int max=index;
        if(leftNode<size&&arr[max]<arr[leftNode]){
            max=leftNode;
        }
        if(rightNode<size&&arr[max]<arr[rightNode]){
            max=rightNode;
        }

        if(max!=index){
            int temp=arr[index];
            arr[index]=arr[max];
            arr[max]=temp;
            maxHeap(arr,max,size);
        }

    }
}
