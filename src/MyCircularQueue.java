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
public class MyCircularQueue {
    Object[] data = null;
    int capacity;
    int front;
    int rear;
    public MyCircularQueue(){this(10);}
    public MyCircularQueue(int initialSize){
        data = new Object[initialSize];
        capacity = initialSize;
        front = 0;
        rear = 0;
    }

    /**
     * ��Ӳ���
     * ��������ĩβ����Ԫ��
     */
    public boolean enQueue(Object o){
        ensureCapacity();
        data[rear++] = o;
        rear = (rear==capacity)? 0:rear; //��rear��ͷ��ת��
        return true;
    }

    /**
     * ���Ӳ���
     * ��ȡ��ͷԪ��
     */

    public Object deQueue(){
        if(this.isQueueEmpty()){
            throw new RuntimeException("empty queue");
        }
        Object temp = data[front];
        data[front++] = null;
        front = (front == capacity)?0:front;
        return temp;
    }

    /**
     * ��ն���
     */
    public void clearQueue(){
        Arrays.fill(data,null);
        rear = 0;
        front = 0;
    }

    /**
     * �ж϶����Ƿ�Ϊ��
     */
    public boolean isQueueEmpty(){
        if(front==rear && data[front]==null)
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
        return data[front];
    }

    /**
     * ��ȡ����Ԫ����Ŀ
     */
    public int queueLength(){
        if (this.isQueueEmpty())
            return 0;
        return rear>front?rear-front:capacity-(front-rear);
    }

    /**
     * ��̬��������
     */
    public void ensureCapacity(){
        if(rear == front && data[front]!=null){
            throw new RuntimeException("Queue is full!");
        }
    }

    /**
     * ��֤index��Ч��
     */
    public void validate(int index){
        if(index<0||index>capacity){
            throw new RuntimeException("index error: "+index);
        }
    }

    /**
     * ��ӡ����ȫ��Ԫ��
     */
    public void print(){
        System.out.print("[");
        for(int i=front; i<((rear>front)?rear:rear+capacity);i++){
            System.out.print(data[i%capacity].toString()+" ");
        }
        System.out.println("]");
    }

}
