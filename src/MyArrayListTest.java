import java.util.ArrayList;
import java.util.List;

/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(3);

        //������һ����,�����������Ԫ��
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println("������һ���ԣ�");
        myArrayList.print();

        //�����������ԣ��ڵڶ���λ����������4
        myArrayList.insert(1,4);
        System.out.println("�����������ԣ�");
        myArrayList.print();
        System.out.println("Ŀǰ��������"+myArrayList.capacity); //˳����Զ�̬����

        //ɾ����һ���ԣ�ɾ��������λ�õ�Ԫ��
        myArrayList.delete(2);
        System.out.println("ɾ����һ���ԣ�");
        myArrayList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�4��
        myArrayList.remove(4);
        System.out.println("ɾ���������ԣ�");
        myArrayList.print();

        //ɾ���������ԣ�ɾ��Ԫ�ء�6��
        myArrayList.remove(6);
        System.out.println("ɾ���������ԣ�");
        myArrayList.print();

        //�Ĳ������ԣ����ڶ���λ�õ�Ԫ�ظ�Ϊ����5
        myArrayList.set(1,5);
        System.out.println("�Ĳ������ԣ�");
        myArrayList.print();

        //��������ԣ�ȡ��һ��λ�õ�Ԫ��
        System.out.println("��������ԣ�");
        System.out.println(myArrayList.get(0).toString());

    }
}
