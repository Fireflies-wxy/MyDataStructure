/**
 * Created by FireFlies on 2018/4/3.
 *clearStack(): ��ջ��ա�
 *isStackEmpty(): ��ջΪ�գ� ����true�� ���򷵻�false��
 *getTop(): ��ջ�����ҷǿգ� ��e����S��ջ��Ԫ�ء�
 *push(E e): ��ջ���ڣ� ������Ԫ��e��ջS�в���Ϊջ��Ԫ�ء�
 *pop(): ɾ��ջ��ջ��Ԫ�أ� ����e������ֵ��
 *stackLength(): ����ջ��Ԫ�ظ�����
 */
public class MyStack<E> {
    Object[] data = null;
    int capacity;
    int current;

    public MyStack(){
        this(10);
    }

    public MyStack(int initialSize){
        data = new Object[initialSize];
        capacity = initialSize;
        current = 0;
    }

    /**
     *��ջ����push
     * ������˳����add��������β������Ԫ��
     */
    public boolean push(E e){
        ensureSize();
        data[current++] = e;
        return true;
    }

    /**
     * ��ջ����pop
     * ɾ��β��Ԫ��
     */
    public E pop(){
        if(current<=0)
            throw new RuntimeException("ջΪ��");

        return (E) data[--current];
    }

    /**
     * ��ջ�����ҷǿգ� ��e����ջ��Ԫ�ء�
     */
    public E getTop(){
        if(current<=0)
            throw new RuntimeException("ջΪ��");
        return (E) data[current-1];
    }

    /**
     * ����ջ��Ԫ�ظ�����
     * @return
     */
    public int stackLength() {
        return this.current;
    }

    /**
     * ��ջΪ�գ� ����true�� ���򷵻�false��
     */
    public boolean isStackEmpty(){
        if(current==0)
            return true;
        return false;
    }

    /**
     * ��ջ��ա�
     */
    public boolean clearStack(){
        current = 0;
        return true;
    }

    /**
     * ��ȡָ��index��Ԫ��
     * @return
     */
    public E get(int index) {
        validateIndex(index);
        return (E) data[index];
    }

    /**
     *  ��֤��ǰ�±��Ƿ�Ϸ���������Ϸ����׳�����ʱ�쳣
     * @param index �±�
     */
    private void validateIndex(int index) {
        if (index < 0 || index > current) {
            throw new RuntimeException("����index����" + index);
        }
    }

    /**
     * ʵ�����鶯̬����
     */
    public void ensureSize(){
        if(current == capacity){
            capacity *= 2;
            Object[] temp = new Object[capacity];
            for(int i=0; i<current; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
    }

    /**
     * �����ǰ���Ա�����Ԫ��
     */
    public void print(){
        System.out.print("[");
        for(int i=0;i<this.stackLength();i++){
            System.out.print(this.get(i)+" ");
        }
        System.out.println("]");
    }

}
