/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyCircularLinkedListTest {
    public static void main(String[] args) {
        MyCircularLinkedList myCircularLinkedList = new MyCircularLinkedList();

        //������һ����,�����������Ԫ��
        System.out.println("\n������һ���ԣ�");
        myCircularLinkedList.add(new Integer(1));
        myCircularLinkedList.add(new Integer(2));
        myCircularLinkedList.add(new Integer(3));
        myCircularLinkedList.print();

        //�����������ԣ��ڵڶ���λ����������4
        myCircularLinkedList.insert(3,new Integer(4));
        System.out.println("\n�����������ԣ�");
        myCircularLinkedList.print();

        //ɾ����һ���ԣ�ɾ��������λ�õ�Ԫ��
        myCircularLinkedList.delete(2);
        System.out.println("\nɾ����һ���ԣ�");
        myCircularLinkedList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�4��
        System.out.println("\nɾ����������(ɾ��Ԫ��4)��");
        myCircularLinkedList.remove(new Integer(4));
        myCircularLinkedList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�6��
        System.out.println("\nɾ���������ԣ�ɾ��Ԫ��6����");
        myCircularLinkedList.remove(new Integer(6));
        myCircularLinkedList.print();

        //�Ĳ������ԣ����ڶ���λ�õ�Ԫ�ظ�Ϊ����5
        myCircularLinkedList.set(1,new Integer(5));
        System.out.println("\n�Ĳ������ԣ�");
        myCircularLinkedList.print();

        //��������ԣ�ȡ��һ��λ�õ�Ԫ��
        System.out.println("\n��������ԣ�");
        System.out.println(myCircularLinkedList.get(0).toString());

        //�ϲ��������ԣ��ϲ�����ѭ������
        System.out.println("\n�ϲ��������ԣ�");
        MyCircularLinkedList anotherList = new MyCircularLinkedList();
        anotherList.add(7);
        anotherList.add(8);
        anotherList.add(9);
        myCircularLinkedList.combine(anotherList);
        myCircularLinkedList.print();
    }
}
