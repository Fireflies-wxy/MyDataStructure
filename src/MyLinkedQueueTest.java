/**
 * Created by FireFlies on 2018/4/4.
 */
public class MyLinkedQueueTest {
    public static void main(String[] args) {
        MyLinkedQueue myLinkedQueue = new MyLinkedQueue();

        //������Ӳ���
        System.out.println("������Ӳ�����");
        System.out.println(myLinkedQueue.isQueueEmpty());
        myLinkedQueue.enQueue(new Integer(1));
        myLinkedQueue.enQueue(new Integer(2));
        myLinkedQueue.enQueue(new Integer(3));
        myLinkedQueue.print();

        //���Զ�ȡ��ͷ
        System.out.println("Head: "+myLinkedQueue.getHead());

        //���Գ��Ӳ���
        System.out.println("���Գ��Ӳ�����");
        myLinkedQueue.deQueue();
        myLinkedQueue.print();
        myLinkedQueue.deQueue();
        myLinkedQueue.print();
        myLinkedQueue.deQueue();
        myLinkedQueue.print();
    }
}
