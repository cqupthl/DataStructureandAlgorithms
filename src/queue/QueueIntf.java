package queue;

public interface QueueIntf {
    public void enQueue(int num);//入队操作
    public int delQueue();//数据出队列操作
    public int size();//返回队列的元素个数
    public void clear();//清空队列
    public void isEmpty();//判断是否为空
    public Object head();//读取对列首元素
}
