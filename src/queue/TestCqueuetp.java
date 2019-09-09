package queue;

public class TestCqueuetp {
    public static void main(String[] args) {
        QueueIntf queueIntf=new Cqueuetp();
        queueIntf.isEmpty();
        for(int i=0;i<4;i++){
            queueIntf.enQueue(i);
        }
        queueIntf.isEmpty();
        System.out.println(queueIntf.size());
        System.out.println(queueIntf.head());
    }
}
