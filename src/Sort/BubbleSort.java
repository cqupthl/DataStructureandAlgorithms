package Sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] test = { 6, 3, 5, 7, 0, 4, 1, 2 };
        bubbleSort(test);
    }

    public static void bubbleSort(int[] test){
        int len=test.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(test[j]<test[j+1]){
                    int temp=test[j];
                    test[j]=test[j+1];
                    test[j+1]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.println(test[i]);
        }

    }
}
