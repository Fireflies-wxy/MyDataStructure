/**
 * Created by FireFlies on 2018/4/4.
 * �Լ�����ʽ�洢ʵ�ֵ����Ա�
 * ����Ҫ��ʼ������
 * ��������combine��MyCircularLinkedList anotherList��
 */

public class MyCircularLinkedList {

    public Node header = null;// ͷ���
    int size = 0;// ��ʾ�����С��ָ��

    /**
     * ����������ݵĽ�����ڲ���
     * һ����㣺��������ָ����
     */
    class Node {
        Object o;// ����д�ŵ����ݣ�������
        Node next;// ����ָ��ý�����һ����㣨ָ����

        public Node() {}
        public Node(Object o) {
            this.o = o;
        }

        // �ڴ˽����һ�����
        void addNext(Node node) {
            next = node;
        }
    }

    /**
     * ������һ��ֱ����ĩβ����
     * ˼·��
     * ��sizeΪ0����ֱ��Ϊheader��ֵnew Node
     * ��size��Ϊ0����ȡ�������һ���ڵ㣬���˽ڵ��next��ֵΪnew Node
     * size ++
     */
    public boolean add(Object o) {
        if (size == 0) {
            header = new Node(o);
            header.next = header;       //��������
        } else {
            Node temp = this.getNode(size -1);
            temp.next = new Node(o);
            temp.next.next = header;    //��������
        }
        size++;// ��ǰ��С������1
        return true;
    }

    /**
     * ����������ָ��index����
     * ˼·��
     * ������֤index��Ч����
     * ��Ϊ0��ʵ����newNode��newNode.next��ֵΪheader��header��ֵΪnewNode����������
     * ����Ϊ0��ʵ����newNode����ȡindex-1λ�ö�Ӧ��Node temp��֮�����ָ���滻��
     * size++
     */
    public boolean insert(int index, Object o) {
        // ���ж�������ȷ��
        validateIndex(index);

        if (index == 0){
            Node newNode = new Node(o);
            newNode.next = header;
            header = newNode;
        }else{
            Node newNode = new Node(o);
            Node temp = this.getNode(index-1);
            if(index == size-1){
                newNode.next = header;
            }else{
                newNode.next = temp.next;
            }
            temp.next = newNode;
        }
        size++;
        return true;
    }

    /**
     * ɾ����һ
     * ˼·��
     * ����֤index��Ч��
     * ��indexΪ0��ֱ�ӽ�header��ֵΪheader.next
     * ��index��Ϊ0����index-1���ڵ��next��ֵΪindex���ڵ��next
     */

    public boolean delete(int index){
        // ���ж�������ȷ��
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
     * ɾ��������ֱ��ɾ��Ԫ��
     * ˼·��ֱ�Ӵ�0��ʼ��������,�����ڲ��Ҳ���
     * ������ĳ�λ�ȡ����������Ҫɾ��������ͬ�����¼����λ�ã���ִ��delete����
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
     * �Ĳ���
     * ˼·��
     * ������֤index��Ч��
     * ֱ�ӻ�ȡindex���ڵ�temp
     * ȡtemp������e��ֱ�Ӹ�ֵΪ�µ�e
     * ���õ�N������ֵ
     *
     */
    public boolean set(int index, Object o) {
        // ���ж�������ȷ��
        validateIndex(index);
        //Node<E> newNode = new Node<E>(e);
        // �õ���x�����
        Node temp = getNode(index);
        temp.o = o;
        return true;
    }

    /**
     * �������
     * ����֤index��Ч��
     * ˼·��
     * �����ͷ��㿪ʼ����
     * ʵ����Node����temp������ֵΪheader����Ϊ��ͷ��㿪ʼ����
     * ����count����������0��ʼ����count��=index����temp = temp.next,һֱ����ȥ����������1
     * ֱ��count = indexֹͣ���ң�ȡtemp.e��ֵ�����ء�
     *
     */
    public Object get(int index) {
        // ���ж�������ȷ��
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
     * �������
     * ����֤index��Ч��
     * ˼·��
     * �����ͷ��㿪ʼ����
     * ʵ����Node����temp������ֵΪheader����Ϊ��ͷ��㿪ʼ����
     * ����count����������0��ʼ����count��=index����temp = temp.next,һֱ����ȥ����������1
     * ֱ��count = indexֹͣ���ң�����temp�ڵ㡣
     *
     */
    private Node getNode(int index) {
        // ���ж�������ȷ��
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
     * �ϲ�������
     * �ϲ�����ѭ������
     * ˼·��
     * ������1��βָ��ָ������2��ͷ��㣬����2��βָ��ָ������1��ͷ���
     */
    public MyCircularLinkedList combine(MyCircularLinkedList anotherList){
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
     *  ��֤��ǰ�±��Ƿ�Ϸ���������Ϸ����׳�����ʱ�쳣
     */
    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("����index����" + index);
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