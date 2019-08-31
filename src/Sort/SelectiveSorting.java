package Sort;

public class SelectiveSorting {
    public static void main(String[] args) {
        int[] test = { 6, 3, 5, 7, 0, 4, 1, 2 };
        selectiveSorting(test);
    }

    private static void selectiveSorting(int[] test) {
        int len=test.length;
        for(int i=0;i<len-1;i++){
            int min=i;
            for(int j=i;j<len;j++){
               if(test[min]>test[j]){
                   min=j;
               }
            }
         if(min!=i){
             int temp=test[i];
             test[i]=test[min];
             test[min]=temp;
         }
        }

        for(int i=0;i<len;i++){
            System.out.println(test[i]);
        }
    }
}
