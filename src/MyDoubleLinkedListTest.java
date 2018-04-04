import org.omg.CORBA._IDLTypeStub;

/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyDoubleLinkedListTest {
    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();

        //������һ����,�����������Ԫ��
        System.out.println("\n������һ���ԣ�");
        myDoubleLinkedList.add(new Integer(1));
        myDoubleLinkedList.add(new Integer(2));
        myDoubleLinkedList.add(new Integer(3));
        myDoubleLinkedList.print();

        //�����������ԣ��ڵڶ���λ����������4
        myDoubleLinkedList.insert(3,new Integer(4));
        myDoubleLinkedList.insert(0,new Integer(0));
        System.out.println("\n�����������ԣ�");
        myDoubleLinkedList.print();

        //ɾ����һ���ԣ�ɾ����һ������λ�õ�Ԫ��
        myDoubleLinkedList.delete(2);
        myDoubleLinkedList.delete(0);
        System.out.println("\nɾ����һ���ԣ�");
        myDoubleLinkedList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�4��
        System.out.println("\nɾ����������(ɾ��Ԫ��4)��");
        myDoubleLinkedList.remove(new Integer(4));
        myDoubleLinkedList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�6��
        System.out.println("\nɾ���������ԣ�ɾ��Ԫ��6����");
        myDoubleLinkedList.remove(new Integer(6));
        myDoubleLinkedList.print();

        //�Ĳ������ԣ����ڶ���λ�õ�Ԫ�ظ�Ϊ����5
        myDoubleLinkedList.set(1,new Integer(5));
        System.out.println("\n�Ĳ������ԣ�");
        myDoubleLinkedList.print();

        //��������ԣ�ȡ��һ��λ�õ�Ԫ��
        System.out.println("\n��������ԣ�");
        System.out.println(myDoubleLinkedList.get(0).toString());

        //�ϲ��������ԣ��ϲ�����ѭ������
        System.out.println("\n�ϲ��������ԣ�");
        MyDoubleLinkedList anotherList = new MyDoubleLinkedList();
        anotherList.add(7);
        anotherList.add(8);
        anotherList.add(9);
        myDoubleLinkedList.combine(anotherList);
        myDoubleLinkedList.print();
    }
}
