/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);

        //���Խ�ջ����
        System.out.println("���Խ�ջ������");
        myStack.push(new Integer(1));
        myStack.push(new Integer(2));
        myStack.push(new Integer(3));
        myStack.print();

        //����getTop
        System.out.println("�鿴ջ��Ԫ��");
        System.out.println("Stack top: "+myStack.getTop().toString());


        //���Գ�ջ����
        System.out.println("���Գ�ջ������");
        System.out.println("��ջԪ�أ�"+myStack.pop().toString());
        myStack.print();
        System.out.println("��ջԪ�أ�"+myStack.pop().toString());
        myStack.print();

        //������ղ���
        System.out.println("������ղ���");
        myStack.clearStack();
        System.out.println("Stack empty: "+myStack.isStackEmpty());
    }
}
