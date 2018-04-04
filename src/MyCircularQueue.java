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
     * 入队操作
     * 在数组最末尾插入元素
     */
    public boolean enQueue(Object o){
        ensureCapacity();
        data[rear++] = o;
        rear = (rear==capacity)? 0:rear; //若rear到头则转向
        return true;
    }

    /**
     * 出队操作
     * 读取对头元素
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
     * 清空队列
     */
    public void clearQueue(){
        Arrays.fill(data,null);
        rear = 0;
        front = 0;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isQueueEmpty(){
        if(front==rear && data[front]==null)
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
        return data[front];
    }

    /**
     * 获取队列元素数目
     */
    public int queueLength(){
        if (this.isQueueEmpty())
            return 0;
        return rear>front?rear-front:capacity-(front-rear);
    }

    /**
     * 动态扩充容量
     */
    public void ensureCapacity(){
        if(rear == front && data[front]!=null){
            throw new RuntimeException("Queue is full!");
        }
    }

    /**
     * 验证index有效性
     */
    public void validate(int index){
        if(index<0||index>capacity){
            throw new RuntimeException("index error: "+index);
        }
    }

    /**
     * 打印队列全部元素
     */
    public void print(){
        System.out.print("[");
        for(int i=front; i<((rear>front)?rear:rear+capacity);i++){
            System.out.print(data[i%capacity].toString()+" ");
        }
        System.out.println("]");
    }

}
