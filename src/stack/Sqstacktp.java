package stack;

public class Sqstacktp implements StackIntf {

    final int maxSize=10;
    int elem[]=new int[maxSize];
    int top;

    public Sqstacktp() {
        top=0;
    }

    public Sqstacktp(int[] elem, int top) {
        this.elem = elem;
        this.top = top;
    }

    public void push(int x) {   //入栈
        if(top==maxSize){
            System.out.println("栈满");
        }else{
            elem[top++]=x;
        }
    }

   //出栈
    public Object pop() {
       if(top==0){
           return 0;
       }else{
           top--;
           return elem[top];
       }
    }


    public int size() {
        return top;
    }


//    public void clear() {
//
//    }


    public void isEmpty() {
     if(top==0){
         System.out.println("空的");
     }else{
         System.out.println("非空");
     }
    }


    public int top() {
         if(top==0){
             return 0;
         }else{
             return elem[top-1];
         }
    }
}
