/**
 * Created by FireFlies on 2018/4/4.
 */
public class MyCircularQueueTest {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);

        //测试入队操作
        System.out.println("测试入队操作：");
        System.out.println(myCircularQueue.isQueueEmpty());
        myCircularQueue.enQueue(new Integer(1));
        myCircularQueue.enQueue(new Integer(2));
        myCircularQueue.enQueue(new Integer(3));
        myCircularQueue.enQueue(new Integer(4));
        myCircularQueue.enQueue(new Integer(5));
        myCircularQueue.print();

        //测试读取队头
        System.out.println("Head: "+myCircularQueue.getHead());

        //测试出队操作
        System.out.println("测试出队操作：");
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();

        //再次测试入队
        System.out.println("再次测试入队操作：");
        myCircularQueue.enQueue(new Integer(6));
        myCircularQueue.enQueue(new Integer(7));
        myCircularQueue.enQueue(new Integer(8));
        myCircularQueue.print();

        //再次出队测试
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();

        //再再次入队测试
        System.out.println("再再次测试入队操作：");
        myCircularQueue.enQueue(new Integer(9));
        myCircularQueue.enQueue(new Integer(10));
        myCircularQueue.enQueue(new Integer(11));
        myCircularQueue.print();
    }
}
