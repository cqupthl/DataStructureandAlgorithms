package Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] test = { 6, 3, 5, 7, 0, 4, 1, 2 };
        insertionSort(test);
    }

    private static void insertionSort(int[] test) {
        int len=test.length;
        for(int i=1;i<len;i++){
            for(int j=i;j>0;j--){
                if(test[j]<test[j-1]){
                    int temp=test[j];
                    test[j]=test[j-1];
                    test[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.println(test[i]);
        }
    }
}
