package queue;

/*
* 必须要设头结点
* */
public class Lqueuetp implements QueueIntf {

    NodeType front;

    NodeType rear;

    public Lqueuetp() {
        front=new NodeType();
        front.next=null;
        rear=front;
    }

    @Override
    public void enQueue(int num) {
      NodeType temp=new NodeType(num);
      rear.next=temp;
      rear=temp;
    }

    @Override
    public int delQueue() {
        int i;
        NodeType p;
        if(front==rear){
            return 0;
        }else{
         p=front.next;
         front=p;
         if(p.next==null){
             rear=front;
         }
         i=p.data;
         p=null;
        }
 return i;
    }

    @Override
    public int size() {
        int i=0;
        NodeType temp=front.next;
        while (temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
    }

    @Override
    public void clear() {

    }

    @Override
    public void isEmpty() {

    }

    @Override
    public Object head() {
      if(front==rear){
          return 0;
      }else{
          return front.next.data;
      }
    }
}
