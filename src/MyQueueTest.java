/**
 * Created by FireFlies on 2018/4/4.
 */
public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);

        //测试入队操作
        System.out.println("测试入队操作：");
        System.out.println(myQueue.isQueueEmpty());
        myQueue.enQueue(new Integer(1));
        myQueue.enQueue(new Integer(2));
        myQueue.enQueue(new Integer(3));
        myQueue.print();

        //测试读取队头
        System.out.println("Head: "+myQueue.getHead());

        //测试出队操作
        System.out.println("测试出队操作：");
        myQueue.deQueue();
        myQueue.print();
        myQueue.deQueue();
        myQueue.print();
        myQueue.deQueue();
        myQueue.print();
    }
}
