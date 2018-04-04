/**
 * Created by FireFlies on 2018/3/21.
 * 自己用链式存储实现的线性表
 * 不需要初始化容量
 */

public class MyLinkedList<E> {

    public Node<E> header = null;// 头结点
    int size = 0;// 表示数组大小的指标

    /**
     * 用来存放数据的结点型内部类
     * 一个结点：数据域与指针域
     */
    class Node<E> {
        E e;// 结点中存放的数据（数据域）
        Node<E> next;// 用来指向该结点的下一个结点（指针域）

        public Node() {}
        public Node(E e) {
            this.e = e;
        }

        // 在此结点后加一个结点
        void addNext(Node<E> node) {
            next = node;
        }
    }

    /**
     * 增操作一：直接在末尾增加
     * 思路：
     * 若size为0，则直接为header赋值new Node
     * 若size不为0，获取链表最后一个节点，将此节点的next赋值为new Node
     * size ++
     * @param e
     * @return
     */
    public boolean add(E e) {
        if (size == 0) {
            header = new Node<E>(e);
        } else {
            Node<E> temp = this.getNode(size -1);
            temp.next = new Node<E>(e);
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
     * @param index
     * @param e
     * @return
     */
    public boolean insert(int index, E e) {
        // 先判断索引正确性
        validateIndex(index);

        if (index == 0){
            Node<E> newNode = new Node<E>(e);
            newNode.next = header;
            header = newNode;
        }else{
            Node<E> newNode = new Node<E>(e);
            Node<E> temp = this.getNode(index-1);
            newNode.next = temp.next;
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
     * size--；
     * @param index
     * @return
     */

    public boolean delete(int index){
        // 先判断索引正确性
        validateIndex(index);

        if(index == 0){
            header = header.next;
        }else{
            this.getNode(index-1).next = this.getNode(index).next;
        }
        size--;
        return true;
    }

    /**
     * 删操作二：直接删除元素
     * 思路：直接从0开始遍历链表,类似于查找操作
     * 当发现某次获取到的数据与要删除数据相同，则记录索引位置，并执行delete操作
     * @return
     */

    public boolean remove(E e){
        boolean flag = true;
        Node<E> temp = header;
        for(int count = 0;count<size;count++) {
            if (temp.e.equals(e)) {
                this.delete(count);
                flag = false;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("Element not found: "+e.toString());
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
     * @param e
     * @return
     */
    public boolean set(int index, E e) {
        // 先判断索引正确性
        validateIndex(index);
        //Node<E> newNode = new Node<E>(e);
        // 得到第x个结点
        Node<E> temp = getNode(index);
        temp.e = e;
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
     * @param index
     * @return
     */
    public E get(int index) {
        // 先判断索引正确性
        validateIndex(index);
        Node<E> tem = header;
        int count = 0;
        while (count != index) {
            tem = tem.next;
            count++;
        }
        E e = tem.e;
        return e;
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
     * @param index
     * @return
     */
    private Node<E> getNode(int index) {
        // 先判断索引正确性
        validateIndex(index);
        Node<E> temp = header;
        int count = 0;
        while(count!=index){
            temp = temp.next;
            count++;
        }
        return temp;
    }


    public int size() {
        return this.size;
    }


    /**
     *  验证当前下标是否合法，如果不合法，抛出运行时异常
     * @param index 下标
     */
    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("数组index错误：" + index);
        }
    }

    public void print(){
        for(int i =0;i<this.size();i++){
            System.out.println(this.get(i).toString());
        }
    }



}