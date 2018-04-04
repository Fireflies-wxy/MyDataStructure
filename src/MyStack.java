/**
 * Created by FireFlies on 2018/4/3.
 *clearStack(): 将栈清空。
 *isStackEmpty(): 若栈为空， 返回true， 否则返回false。
 *getTop(): 若栈存在且非空， 用e返回S的栈顶元素。
 *push(E e): 若栈存在， 插入新元素e到栈S中并成为栈顶元素。
 *pop(): 删除栈中栈顶元素， 并用e返回其值。
 *stackLength(): 返回栈的元素个数。
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
     *进栈操作push
     * 类似于顺序表的add操作，在尾部加入元素
     */
    public boolean push(E e){
        ensureSize();
        data[current++] = e;
        return true;
    }

    /**
     * 出栈操作pop
     * 删除尾部元素
     */
    public E pop(){
        if(current<=0)
            throw new RuntimeException("栈为空");

        return (E) data[--current];
    }

    /**
     * 若栈存在且非空， 用e返回栈顶元素。
     */
    public E getTop(){
        if(current<=0)
            throw new RuntimeException("栈为空");
        return (E) data[current-1];
    }

    /**
     * 返回栈的元素个数。
     * @return
     */
    public int stackLength() {
        return this.current;
    }

    /**
     * 若栈为空， 返回true， 否则返回false。
     */
    public boolean isStackEmpty(){
        if(current==0)
            return true;
        return false;
    }

    /**
     * 将栈清空。
     */
    public boolean clearStack(){
        current = 0;
        return true;
    }

    /**
     * 获取指定index的元素
     * @return
     */
    public E get(int index) {
        validateIndex(index);
        return (E) data[index];
    }

    /**
     *  验证当前下标是否合法，如果不合法，抛出运行时异常
     * @param index 下标
     */
    private void validateIndex(int index) {
        if (index < 0 || index > current) {
            throw new RuntimeException("数组index错误：" + index);
        }
    }

    /**
     * 实现数组动态扩容
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
     * 输出当前线性表所有元素
     */
    public void print(){
        System.out.print("[");
        for(int i=0;i<this.stackLength();i++){
            System.out.print(this.get(i)+" ");
        }
        System.out.println("]");
    }

}
