import java.util.Arrays;

/**
 * Created by FireFlies on 2018/4/3.
 *clearStack(): 将栈清空。
 *isStackEmpty(): 若栈为空， 返回true， 否则返回false。
 *getTop(): 若栈存在且非空， 用e返回S的栈顶元素。
 *push(E e): 若栈存在， 插入新元素e到栈S中并成为栈顶元素。
 *pop(): 删除栈中栈顶元素， 并用e返回其值。
 *stackLength(): 返回栈的元素个数。
 */
public class MyLinkedStack {
    private int capacity = 0;
    private Node top = null; //保存该链栈的栈顶元素

    public class Node{
        private Object o;
        private Node next = null;
        public Node(){}
        public Node(Object o){this.o = o;}
    }

    /**
     *进栈操作push
     * 类似于顺序表的add操作，在尾部加入元素
     */
    public boolean push(Object o){
        Node newNode = new Node(o);
        newNode.next = top;
        top = newNode;
        capacity++;
        return true;
    }

    /**
     * 出栈操作pop
     * 删除尾部元素
     */
    public Object pop(){
        if(this.stackLength()<=0)
            throw new RuntimeException("栈为空");
        top = top.next;
        capacity--;
        return top.o;

    }

    /**
     * 若栈存在且非空， 用e返回栈顶元素。
     */
    public Object getTop(){
        if(this.stackLength()<=0)
            throw new RuntimeException("栈为空");
        return top.o;
    }

    /**
     * 返回栈的元素个数。
     * @return
     */
    public int stackLength() {
        return this.capacity;
    }

    /**
     * 若栈为空， 返回true， 否则返回false。
     */
    public boolean isStackEmpty(){
        if(this.stackLength()==0)
            return true;
        return false;
    }

    /**
     * 将栈清空。
     */
    public boolean clearStack(){
        capacity = 0;
        return true;
    }

    /**
     * 获取指定index的元素
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
     *  验证当前下标是否合法，如果不合法，抛出运行时异常
     * @param index 下标
     */
    private void validateIndex(int index) {
        if (index < 0 || index > this.stackLength()) {
            throw new RuntimeException("数组index错误：" + index);
        }
    }

    /**
     * 输出当前线性表所有元素
     */
    public void print(){
        System.out.print("[");
        for(int i=0;i<this.stackLength();i++){
            System.out.print(this.get(i).toString()+" ");
        }
        System.out.println("]");
    }

}
