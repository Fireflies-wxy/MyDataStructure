/**
 * Created by FireFlies on 2018/4/4.
 */
public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);

        //������Ӳ���
        System.out.println("������Ӳ�����");
        System.out.println(myQueue.isQueueEmpty());
        myQueue.enQueue(new Integer(1));
        myQueue.enQueue(new Integer(2));
        myQueue.enQueue(new Integer(3));
        myQueue.print();

        //���Զ�ȡ��ͷ
        System.out.println("Head: "+myQueue.getHead());

        //���Գ��Ӳ���
        System.out.println("���Գ��Ӳ�����");
        myQueue.deQueue();
        myQueue.print();
        myQueue.deQueue();
        myQueue.print();
        myQueue.deQueue();
        myQueue.print();
    }
}
