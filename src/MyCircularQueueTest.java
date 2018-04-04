/**
 * Created by FireFlies on 2018/4/4.
 */
public class MyCircularQueueTest {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);

        //������Ӳ���
        System.out.println("������Ӳ�����");
        System.out.println(myCircularQueue.isQueueEmpty());
        myCircularQueue.enQueue(new Integer(1));
        myCircularQueue.enQueue(new Integer(2));
        myCircularQueue.enQueue(new Integer(3));
        myCircularQueue.enQueue(new Integer(4));
        myCircularQueue.enQueue(new Integer(5));
        myCircularQueue.print();

        //���Զ�ȡ��ͷ
        System.out.println("Head: "+myCircularQueue.getHead());

        //���Գ��Ӳ���
        System.out.println("���Գ��Ӳ�����");
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();

        //�ٴβ������
        System.out.println("�ٴβ�����Ӳ�����");
        myCircularQueue.enQueue(new Integer(6));
        myCircularQueue.enQueue(new Integer(7));
        myCircularQueue.enQueue(new Integer(8));
        myCircularQueue.print();

        //�ٴγ��Ӳ���
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();
        myCircularQueue.deQueue();
        myCircularQueue.print();

        //���ٴ���Ӳ���
        System.out.println("���ٴβ�����Ӳ�����");
        myCircularQueue.enQueue(new Integer(9));
        myCircularQueue.enQueue(new Integer(10));
        myCircularQueue.enQueue(new Integer(11));
        myCircularQueue.print();
    }
}
