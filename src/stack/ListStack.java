package stack;

public class ListStack implements StackIntf {

    StackNode top;

    public ListStack(StackNode top) {
        this.top = top;
    }

    public ListStack() {
        this.top=null;
    }

    @Override
    public void push(int obj) {
      StackNode newNode=new StackNode(obj);
      if(top==null){
          top=newNode;
      }else{
         newNode.next=top;
         top=newNode;
      }

    }

    @Override
    public Object pop() {
       StackNode temp;
       int x;
       if(top==null){
           return null;
       }else{
          x=top.data;
          temp=top.next;
          top=temp;
          temp=null;
          return x;
       }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void isEmpty() {

    }

    @Override
    public int top() {
        return 0;
    }
}
