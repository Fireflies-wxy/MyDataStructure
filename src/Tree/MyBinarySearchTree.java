package Tree;

import java.io.Serializable;

public class MyBinarySearchTree<T extends Comparable> {
    private BinaryNode<T> root;
    private int size;

    public class BinaryNode<T extends Comparable> implements Serializable {
        public BinaryNode left;
        public BinaryNode right;
        public T data;

        public BinaryNode(T data, BinaryNode left, BinaryNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public BinaryNode(T data){
            this(data,null,null);
        }

        public boolean ifLeaf(){
            return this.left==null&&this.right==null;
        }
    }

    /**
     * 初始化BinarySearchTree
     */
    public MyBinarySearchTree(){
        root = null;
    }

    /**
     * 判断树是否为空
     */
    public boolean isEmpty(){
        return false;
    }

    /**
     * 返回树内元素个数
     */
    public int size(){
        return this.size;
    }

    /**
     * 返回树的深度
     */
    public int height(){return 0;}

    /**
     * 前序遍历
     */
    public void preOrder(){ }

    /**
     * 中序遍历
     */
    public void inOrder(){}

    /**
     * 后序遍历
     */
    public void postOrder(){}

    /**
     * 插入操作
     */
    public void insert(T data){
        if(data == null)
            throw new RuntimeException("Data cannot be null.");
        root = insert(data,root);
    }
    //通过递归实现插入操作
    private BinaryNode<T> insert(T data, BinaryNode<T> p){
        //边界条件
        if(p==null){
            p = new BinaryNode<>(data,null,null);
        }

        int temp = data.compareTo(p.data);

        if(temp<0){
            p.left = insert(data,p.left);
        }else if(temp>0){
            p.right = insert(data,p.right);
        }else{

        }
        return p;
    }

    /**
     * 删除操作
     */
    public void remove(T data){

    }

    /**
     * 返回最小值
     */
    public T finMin(){ }

    /**
     * 返回最大值
     */
    public T finMax(){}

    /**
     * 根据data找到节点
     */
    public BinaryNode findNode(T data){

    }

    /**
     *对象是否存在
     */
    public boolean contains(T data){return false;}

    /**
     * 清空操作
     */
}
