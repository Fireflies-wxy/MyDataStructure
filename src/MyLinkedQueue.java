import java.util.Arrays;

/**
 * Created by FireFlies on 2018/4/4.
 * ��ͨ���У��ײ�ʹ������ʵ��
 * clearQueue(): ��������ա�
 * isQueueEmpty(): ������Ϊ�գ� ����true�� ���򷵻�false��
 * getHead(): �����д����ҷǿգ� ��o���ض��еĶ�ͷԪ�ء�
 * enQueue(Object o): �����д��ڣ� ������Ԫ��o�������в���Ϊ��βԪ��
 * deQueue(): ɾ�������ж�ͷԪ�أ� ����o������ֵ��
 * queueLength(): ���ض���Q��Ԫ�ظ���
 */
public class MyLinkedQueue {
    private int capacity;
    private Node front;
    private Node rear;

    public class Node{
        private Object o;
        private Node next = null;
        public Node(){}
        public Node(Object o){
            this.o = o;
        }
    }

    /**
     * ��Ӳ���
     * ��������ĩβ����Ԫ��
     */
    public boolean enQueue(Object o){
        //����������л��ǿ�������
       if(front == null){
           front = new Node(o);
           rear = front;//ֻ��һ���ڵ㣬front��rear��ָ��ýڵ�
       }else{
           Node newNode = new Node(o);
           rear.next = newNode;
           rear = newNode;
       }
       capacity++;
       return true;
    }

    /**
     * ���Ӳ���
     * ��ȡ��ͷԪ��
     */

    public Object deQueue(){
        Node temp = front;
        front = front.next;
        temp.next = null;
        capacity--;
        return temp.o;
    }

    /**
     * ��ն���
     */
    public void clearQueue(){
        front = null;
        rear = null;
        capacity = 0;
    }

    /**
     * �ж϶����Ƿ�Ϊ��
     */
    public boolean isQueueEmpty(){
        if(this.queueLength()==0)
            return true;
        return false;
    }

    /**
     * ��ȡ��ͷԪ��
     */
    public Object getHead(){
        if(this.isQueueEmpty()){
            throw new RuntimeException("empty queue");
        }
        return front.o.toString();
    }

    /**
     * ��ȡ����Ԫ����Ŀ
     */
    public int queueLength(){
        return this.capacity;
    }


    private Node getNode(int index) {
        // ���ж�������ȷ��
        if(index<0||index>=this.capacity){
            throw new RuntimeException("index error: "+index);
        }
        Node temp = front;
        int count = 0;
        while(count!=index){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    /**
     * ��ӡ����ȫ��Ԫ��
     */
    public void print(){
        System.out.print("[");
        for(int i=0; i<this.queueLength();i++){
            System.out.print(this.getNode(i).o.toString()+" ");
        }
        System.out.println("]");
    }

}
