import java.util.Arrays;

/**
 * Created by FireFlies on 2018/4/3.
 *clearStack(): ��ջ��ա�
 *isStackEmpty(): ��ջΪ�գ� ����true�� ���򷵻�false��
 *getTop(): ��ջ�����ҷǿգ� ��e����S��ջ��Ԫ�ء�
 *push(E e): ��ջ���ڣ� ������Ԫ��e��ջS�в���Ϊջ��Ԫ�ء�
 *pop(): ɾ��ջ��ջ��Ԫ�أ� ����e������ֵ��
 *stackLength(): ����ջ��Ԫ�ظ�����
 */
public class MyLinkedStack {
    private int capacity = 0;
    private Node top = null; //�������ջ��ջ��Ԫ��

    public class Node{
        private Object o;
        private Node next = null;
        public Node(){}
        public Node(Object o){this.o = o;}
    }

    /**
     *��ջ����push
     * ������˳����add��������β������Ԫ��
     */
    public boolean push(Object o){
        Node newNode = new Node(o);
        newNode.next = top;
        top = newNode;
        capacity++;
        return true;
    }

    /**
     * ��ջ����pop
     * ɾ��β��Ԫ��
     */
    public Object pop(){
        if(this.stackLength()<=0)
            throw new RuntimeException("ջΪ��");
        top = top.next;
        capacity--;
        return top.o;

    }

    /**
     * ��ջ�����ҷǿգ� ��e����ջ��Ԫ�ء�
     */
    public Object getTop(){
        if(this.stackLength()<=0)
            throw new RuntimeException("ջΪ��");
        return top.o;
    }

    /**
     * ����ջ��Ԫ�ظ�����
     * @return
     */
    public int stackLength() {
        return this.capacity;
    }

    /**
     * ��ջΪ�գ� ����true�� ���򷵻�false��
     */
    public boolean isStackEmpty(){
        if(this.stackLength()==0)
            return true;
        return false;
    }

    /**
     * ��ջ��ա�
     */
    public boolean clearStack(){
        capacity = 0;
        return true;
    }

    /**
     * ��ȡָ��index��Ԫ��
     * @return
     */
    public Object get(int index) {
        validateIndex(index);
        Node temp = top;
        Object result = null;
        for(int i=0; i<this.stackLength();i++){
            if(i == index){
                result =  temp.o;
            }
            temp = temp.next;
        }
        return result;
    }

    /**
     *  ��֤��ǰ�±��Ƿ�Ϸ���������Ϸ����׳�����ʱ�쳣
     * @param index �±�
     */
    private void validateIndex(int index) {
        if (index < 0 || index > this.stackLength()) {
            throw new RuntimeException("����index����" + index);
        }
    }

    /**
     * �����ǰ���Ա�����Ԫ��
     */
    public void print(){
        System.out.print("[");
        for(int i=0;i<this.stackLength();i++){
            System.out.print(this.get(i).toString()+" ");
        }
        System.out.println("]");
    }

}
