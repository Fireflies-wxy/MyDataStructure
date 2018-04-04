import org.omg.CORBA._IDLTypeStub;

/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyDoubleLinkedListTest {
    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();

        //增操作一测试,添加三个整数元素
        System.out.println("\n增操作一测试：");
        myDoubleLinkedList.add(new Integer(1));
        myDoubleLinkedList.add(new Integer(2));
        myDoubleLinkedList.add(new Integer(3));
        myDoubleLinkedList.print();

        //增操作二测试，在第二个位置增加整数4
        myDoubleLinkedList.insert(3,new Integer(4));
        myDoubleLinkedList.insert(0,new Integer(0));
        System.out.println("\n增操作二测试：");
        myDoubleLinkedList.print();

        //删操作一测试，删除第一、三个位置的元素
        myDoubleLinkedList.delete(2);
        myDoubleLinkedList.delete(0);
        System.out.println("\n删操作一测试：");
        myDoubleLinkedList.print();

        //删操作二测试，删除元素“4”
        System.out.println("\n删操作二测试(删除元素4)：");
        myDoubleLinkedList.remove(new Integer(4));
        myDoubleLinkedList.print();

        //删操作二测试，删除元素“6”
        System.out.println("\n删操作二测试（删除元素6）：");
        myDoubleLinkedList.remove(new Integer(6));
        myDoubleLinkedList.print();

        //改操作测试，将第二个位置的元素改为整数5
        myDoubleLinkedList.set(1,new Integer(5));
        System.out.println("\n改操作测试：");
        myDoubleLinkedList.print();

        //查操作测试，取第一个位置的元素
        System.out.println("\n查操作测试：");
        System.out.println(myDoubleLinkedList.get(0).toString());

        //合并操作测试，合并两个循环链表
        System.out.println("\n合并操作测试：");
        MyDoubleLinkedList anotherList = new MyDoubleLinkedList();
        anotherList.add(7);
        anotherList.add(8);
        anotherList.add(9);
        myDoubleLinkedList.combine(anotherList);
        myDoubleLinkedList.print();
    }
}
