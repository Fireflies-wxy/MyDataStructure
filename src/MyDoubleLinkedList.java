/**
 * Created by FireFlies on 2018/4/4.
 * 双向链表，同时具有两个指针next与prior
 * add
 * insert
 * delete操作改变
 */

public class MyDoubleLinkedList {

    public Node header = null;// 头结点
    int size = 0;// 表示数组大小的指标

    /**
     * 用来存放数据的结点型内部类
     * 一个结点：数据域与指针域
     */
    class Node {
        Object o;// 结点中存放的数据（数据域）
        Node next;// 用来指向该结点的下一个结点（指针域）
        Node prior;//用来指向该结点的上一个结点（指针域）

        public Node() {}
        public Node(Object o) {
            this.o = o;
        }
    }

    /**
     * 增操作一：直接在末尾增加
     * 思路：
     * 若size为0，则直接为header赋值new Node
     * 若size不为0，获取链表最后一个节点，将此节点的next赋值为new Node
     * size ++
     */
    public boolean add(Object o) {
        if (size == 0) {
            header = new Node(o);
            header.next = header;
            header.prior = header;
        } else {
            Node temp = this.getNode(size -1);
            Node newNode = new Node(o);
            //四步完成指针替换
            newNode.prior = temp;
            newNode.next = header;
            header.prior = newNode;
            temp.next = newNode;
        }
        size++;// 当前大小自增加1
        return true;
    }

    /**
     * 增操作二：指定index增加
     * 思路：
     * 首先验证index有效性能
     * 若为0，实例化newNode，newNode.next赋值为header，header赋值为newNode（三步）；
     * 若不为0，实例化newNode并获取index-1位置对应的Node temp，之后进行指针替换。
     * size++
     */
    public boolean insert(int index, Object o) {
        // 先判断索引正确性
        validateIndex(index);

        if (index == 0){
            Node newNode = new Node(o);
            newNode.next = header;
            newNode.prior = header.prior;
            header = newNode;
        }else{
            Node newNode = new Node(o);
            Node temp = this.getNode(index-1);

            newNode.next = temp.next;
            newNode.prior = temp;
            temp.next.prior = newNode;
            temp.next = newNode;
        }
        size++;
        return true;
    }

    /**
     * 删操作一
     * 思路：
     * 先验证index有效性
     * 若index为0，直接将header赋值为header.next
     * 若index不为0，将index-1处节点的next赋值为index处节点的next
     */

    public boolean delete(int index){
        // 先判断索引正确性
        validateIndex(index);

        if(index == 0){
            header.next.prior = header.prior;
            header = header.next;
        }else{
            this.getNode(index).prior.next = this.getNode(index).next;
            this.getNode(index).next.prior = this.getNode(index).prior;
        }
        size--;
        return true;
    }

    /**
     * 删操作二：直接删除元素
     * 思路：直接从0开始遍历链表,类似于查找操作
     * 当发现某次获取到的数据与要删除数据相同，则记录索引位置，并执行delete操作
     */

    public boolean remove(Object o){
        boolean flag = true;
        Node temp = header;
        for(int count = 0;count<size;count++) {
            if (temp.o.equals(o)) {
                this.delete(count);
                flag = false;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("Element not found: "+o.toString());
            return false;
        }
        return true;
    }

    /**
     * 改操作
     * 思路：
     * 首先验证index有效性
     * 直接获取index处节点temp
     * 取temp的属性e，直接赋值为新的e
     * 设置第N个结点的值
     *
     */
    public boolean set(int index, Object o) {
        // 先判断索引正确性
        validateIndex(index);
        //Node<E> newNode = new Node<E>(e);
        // 得到第x个结点
        Node temp = getNode(index);
        temp.o = o;
        return true;
    }

    /**
     * 查操作：
     * 先验证index有效性
     * 思路：
     * 必须从头结点开始查起
     * 实例化Node对象temp，并赋值为header，意为从头结点开始查起
     * 声明count计数器并从0开始，当count！=index，则temp = temp.next,一直查下去，计数器增1
     * 直到count = index停止查找，取temp.e的值并返回。
     *
     */
    public Object get(int index) {
        // 先判断索引正确性
        validateIndex(index);
        Node tem = header;
        int count = 0;
        while (count != index) {
            tem = tem.next;
            count++;
        }
        Object o = tem.o;
        return o;
    }

    /**
     * 查操作：
     * 先验证index有效性
     * 思路：
     * 必须从头结点开始查起
     * 实例化Node对象temp，并赋值为header，意为从头结点开始查起
     * 声明count计数器并从0开始，当count！=index，则temp = temp.next,一直查下去，计数器增1
     * 直到count = index停止查找，返回temp节点。
     *
     */
    private Node getNode(int index) {
        // 先判断索引正确性
        validateIndex(index);
        Node temp = header;
        int count = 0;
        while(count!=index){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    /**
     * 合并操作：
     * 合并两个循环链表
     * 思路：
     * 将链表1的尾指针指向链表2的头结点，链表2的尾指针指向链表1的头结点
     */
    public MyDoubleLinkedList combine(MyDoubleLinkedList anotherList){
        if(this.size()!=0&&anotherList.size()!=0){
            this.getNode(size - 1).next = anotherList.getNode(0);
            anotherList.getNode(anotherList.size() - 1).next = this.getNode(0);
            size += anotherList.size();
        }else if(this.size()==0&&anotherList.size()!=0){
            return anotherList;
        }else if(anotherList.size()==0&&this.size()!=0){
            System.out.println("Your anotherList is empty!");
        }
        return this;
    }


    public int size() {
        return this.size;
    }


    /**
     *  验证当前下标是否合法，如果不合法，抛出运行时异常
     */
    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("数组index错误：" + index);
        }
    }

    public void print(){
        System.out.print("[");
        for(int i =0;i<this.size();i++){
            System.out.print(this.get(i).toString() +" ");
        }
        System.out.print("]");
    }

}