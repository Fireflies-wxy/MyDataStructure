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
public class MyQueue {
    Object[] data = null;
    int capacity;
    int current;
    public MyQueue(){this(10);}
    public MyQueue(int initialSize){
        data = new Object[initialSize];
        capacity = initialSize;
        current = 0;
    }

    /**
     * ��Ӳ���
     * ��������ĩβ����Ԫ��
     */
    public boolean enQueue(Object o){
        ensureCapacity();
        data[current++] = o;
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
        Object temp = data[0];
        for (int i=0;i<current-1;i++){
            data[i] = data[i+1];
        }
        current--;
        return temp;
    }

    /**
     * ��ն���
     */
    public void clearQueue(){
        Arrays.fill(data,null);
        current = 0;
    }

    /**
     * �ж϶����Ƿ�Ϊ��
     */
    public boolean isQueueEmpty(){
        if(current==0)
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
        return data[0];
    }

    /**
     * ��ȡ����Ԫ����Ŀ
     */
    public int queueLength(){
        return current;
    }

    /**
     * ��̬��������
     */
    public void ensureCapacity(){
        if(this.current>=capacity){
            throw new RuntimeException("Queue is full!");
        }
    }

    /**
     * ��֤index��Ч��
     */
    public void validate(int index){
        if(index<0||index>current){
            throw new RuntimeException("index error: "+index);
        }
    }

    /**
     * ��ӡ����ȫ��Ԫ��
     */
    public void print(){
        System.out.print("[");
        for(int i=0; i<current;i++){
            System.out.print(data[i].toString()+" ");
        }
        System.out.println("]");
    }

}
