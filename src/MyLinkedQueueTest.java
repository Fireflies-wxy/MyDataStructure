/**
 * Created by FireFlies on 2018/4/4.
 */
public class MyLinkedQueueTest {
    public static void main(String[] args) {
        MyLinkedQueue myLinkedQueue = new MyLinkedQueue();

        //测试入队操作
        System.out.println("测试入队操作：");
        System.out.println(myLinkedQueue.isQueueEmpty());
        myLinkedQueue.enQueue(new Integer(1));
        myLinkedQueue.enQueue(new Integer(2));
        myLinkedQueue.enQueue(new Integer(3));
        myLinkedQueue.print();

        //测试读取队头
        System.out.println("Head: "+myLinkedQueue.getHead());

        //测试出队操作
        System.out.println("测试出队操作：");
        myLinkedQueue.deQueue();
        myLinkedQueue.print();
        myLinkedQueue.deQueue();
        myLinkedQueue.print();
        myLinkedQueue.deQueue();
        myLinkedQueue.print();
    }
}
