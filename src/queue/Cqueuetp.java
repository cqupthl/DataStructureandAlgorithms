package queue;

public class Cqueuetp implements QueueIntf {
  final int maxsize=5;
  int elem[]=new int[maxsize];
  int front,rear;
    public Cqueuetp() {
        front=0;
        rear=0;
    }

    @Override
    public void enQueue(int num) {
    if((rear+1)%maxsize==front){
        System.out.println("溢出");
    }else{
        rear=(rear+1)%maxsize;
        elem[rear]=num;
    }
    }

    @Override
    public int delQueue() {
      if(front==rear){
          return 0;
      }else{
          front=(front+1)%maxsize;
          return elem[front];
      }
    }

    @Override
    public int size() {
        return ((maxsize+rear-front)%maxsize);
    }

    @Override
    public void clear() {

    }

    @Override
    public void isEmpty() {
       if(front==rear){
           System.out.println("空的");
       }else{
           System.out.println("非空");
       }
    }

    @Override
    public Object head() {
        if(front==rear){
            return 0;
        }else{
            return (elem[(front+1)%maxsize]);
        }
    }
}
