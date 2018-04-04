import java.util.Arrays;

/**
 * Created by FireFlies on 2018/4/4.
 * 普通队列：底层使用数组实现
 * clearQueue(): 将队列清空。
 * isQueueEmpty(): 若队列为空， 返回true， 否则返回false。
 * getHead(): 若队列存在且非空， 用o返回队列的队头元素。
 * enQueue(Object o): 若队列存在， 插入新元素o到队列中并成为队尾元素
 * deQueue(): 删除队列中队头元素， 并用o返回其值。
 * queueLength(): 返回队列Q的元素个数
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
     * 入队操作
     * 在数组最末尾插入元素
     */
    public boolean enQueue(Object o){
        //如果该链队列还是空链队列
       if(front == null){
           front = new Node(o);
           rear = front;//只有一个节点，front、rear都指向该节点
       }else{
           Node newNode = new Node(o);
           rear.next = newNode;
           rear = newNode;
       }
       capacity++;
       return true;
    }

    /**
     * 出队操作
     * 读取对头元素
     */

    public Object deQueue(){
        Node temp = front;
        front = front.next;
        temp.next = null;
        capacity--;
        return temp.o;
    }

    /**
     * 清空队列
     */
    public void clearQueue(){
        front = null;
        rear = null;
        capacity = 0;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isQueueEmpty(){
        if(this.queueLength()==0)
            return true;
        return false;
    }

    /**
     * 获取队头元素
     */
    public Object getHead(){
        if(this.isQueueEmpty()){
            throw new RuntimeException("empty queue");
        }
        return front.o.toString();
    }

    /**
     * 获取队列元素数目
     */
    public int queueLength(){
        return this.capacity;
    }


    private Node getNode(int index) {
        // 先判断索引正确性
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
     * 打印队列全部元素
     */
    public void print(){
        System.out.print("[");
        for(int i=0; i<this.queueLength();i++){
            System.out.print(this.getNode(i).o.toString()+" ");
        }
        System.out.println("]");
    }

}
