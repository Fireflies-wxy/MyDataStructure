/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyLinkedStackTest {
    public static void main(String[] args) {
        MyLinkedStack myLinkedStack = new MyLinkedStack();

        //���Խ�ջ����
        System.out.println("���Խ�ջ������");
        myLinkedStack.push(new Integer(1));
        myLinkedStack.print();
        myLinkedStack.push(new Integer(2));
        myLinkedStack.print();
        myLinkedStack.push(new Integer(3));
        myLinkedStack.print();

        //����getTop
        System.out.println("�鿴ջ��Ԫ��");
        System.out.println("Stack top: "+myLinkedStack.getTop().toString());


        //���Գ�ջ����
        System.out.println("���Գ�ջ������");
        System.out.println("��ջԪ�أ�"+myLinkedStack.pop().toString());
        myLinkedStack.print();
        System.out.println("��ջԪ�أ�"+myLinkedStack.pop().toString());
        myLinkedStack.print();

        //������ղ���
        System.out.println("������ղ���");
        myLinkedStack.clearStack();
        System.out.println("Stack empty: "+myLinkedStack.isStackEmpty());
    }
}
