package queue;

public class TestLqueuetp {
    public static void main(String[] args) {
        Lqueuetp lqueuetp =new Lqueuetp();
        lqueuetp.enQueue(1);
        lqueuetp.enQueue(2);
        lqueuetp.enQueue(3);
        System.out.println(lqueuetp.size());
        System.out.println(lqueuetp.head());
        System.out.println(lqueuetp.delQueue());
        System.out.println(lqueuetp.size());
    }
}
