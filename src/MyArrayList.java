/**
 * Created by FireFlies on 2018/3/21.
 * 自己用数组实现的线性表
 * 底层使用数组实现，因此需要初始化容量，并实现动态增加容量。
 */

public class MyArrayList<E> {
    Object[] data = null; // 用来保存此队列中内容的数组
    int current;          // 保存当前为第几个元素的指标
    int capacity;         // 表示数组大小的指标

    /**
     * 如果初始化时，未声明大小，则默认为10
     */
    public MyArrayList() {
        this(10);
    }

    /**
     * 初始化线性表，并且声明保存内容的数组大小
     * @param initalSize
     */
    public MyArrayList(int initalSize) {
        if (initalSize < 0) {
            throw new RuntimeException("数组大小错误:" + initalSize);
        } else {
            this.data = new Object[initalSize];
            this.current = 0;
            capacity = initalSize;
        }
    }

    /**
     * 增操作1：直接在表末尾增加元素
     * @param e
     * @return
     */
    public boolean add(E e) {
        ensureCapacity(current);// 确认容量
        this.data[current++] = e;
        return true;
    }

    /**
     * 增操作2：在指定下标位置增加元素
     * @param index 下标
     * @param e 需要插入的数据
     * @return
     */
    public boolean insert(int index, E e) {
        validateIndex(index);
        ensureCapacity(current);
        for(int i = current-1;i>=index;i--)
            data[i+1] = data[i];
        data[index] = e;
        current++;
        return true;
    }

    /**
     * 删操作1
     * 删除指定下标处的数据
     * @param index<br>
     * @return<br>
     */
    public boolean delete(int index){
        validateIndex(index);
        for(int i=index;i<current-1;i++)
            data[i]=data[i+1];
        current--;
        return true;
    }

    /**
     * 删操作2
     * 删除指定的元素
     * @return<br>
     */
    public boolean remove(E e){
        boolean flag = true;
        for(int i=0;i<current;i++){
            if(this.get(i) == e){
                this.delete(i);
                flag = false;
            }
        }
        if(flag){
            System.out.println("Element not found: "+e.toString());
        }
        return true;
    }

    /**
     * 改操作
     * 更改指定下标元素的数据为e
     * @param index
     * @param e
     * @return
     */
    public boolean set(int index, E e) {
        validateIndex(index);
        this.data[index] = e;
        return true;
    }

    /**
     * 查操作
     * 得到指定下标的数据
     * @param index
     * @return
     */
    public E get(int index) {
        validateIndex(index);
        return (E) this.data[index];
    }

    /**
     * 返回当前队列大小
     * @return
     */
    public int size() {
        return this.current;
    }

    /**
     * 确认系统当前容量是否满足需要,如果满足，则不执行操作 如果不满足，增加容量
     * @param cur 当前个数
     */
    private void ensureCapacity(int cur) {
        if (cur == capacity) {
            // 如果达到容量极限，增加3倍容量，复制当前数组
            this.capacity = this.capacity*3;
            Object[] newData = new Object[capacity];
            for (int i = 0; i < cur; i++) {
                newData[i] = this.data[i];
            }
            this.data = newData;
        }
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
     * 输出当前线性表所有元素
     */
    public void print(){
        for(int i=0;i<this.size();i++){
            System.out.println(this.get(i)+" ");
        }
    }
}