/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        //������һ����,�����������Ԫ��
        myLinkedList.add(new Integer(1));
        myLinkedList.add(new Integer(2));
        myLinkedList.add(new Integer(3));
        System.out.println("������һ���ԣ�");
        myLinkedList.print();

        //�����������ԣ��ڵڶ���λ����������4
        myLinkedList.insert(3,new Integer(4));
        System.out.println("�����������ԣ�");
        myLinkedList.print();

        //ɾ����һ���ԣ�ɾ��������λ�õ�Ԫ��
        myLinkedList.delete(2);
        System.out.println("ɾ����һ���ԣ�");
        myLinkedList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�4��
        System.out.println("ɾ����������(ɾ��Ԫ��4)��");
        myLinkedList.remove(new Integer(4));
        myLinkedList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�6��
        System.out.println("ɾ���������ԣ�ɾ��Ԫ��6����");
        myLinkedList.remove(new Integer(6));
        myLinkedList.print();

        //�Ĳ������ԣ����ڶ���λ�õ�Ԫ�ظ�Ϊ����5
        myLinkedList.set(1,new Integer(5));
        System.out.println("�Ĳ������ԣ�");
        myLinkedList.print();

        //��������ԣ�ȡ��һ��λ�õ�Ԫ��
        System.out.println("��������ԣ�");
        System.out.println(myLinkedList.get(0).toString());
    }
}
