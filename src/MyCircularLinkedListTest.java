/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyCircularLinkedListTest {
    public static void main(String[] args) {
        MyCircularLinkedList myCircularLinkedList = new MyCircularLinkedList();

        //增操作一测试,添加三个整数元素
        System.out.println("\n增操作一测试：");
        myCircularLinkedList.add(new Integer(1));
        myCircularLinkedList.add(new Integer(2));
        myCircularLinkedList.add(new Integer(3));
        myCircularLinkedList.print();

        //增操作二测试，在第二个位置增加整数4
        myCircularLinkedList.insert(3,new Integer(4));
        System.out.println("\n增操作二测试：");
        myCircularLinkedList.print();

        //删操作一测试，删除第三个位置的元素
        myCircularLinkedList.delete(2);
        System.out.println("\n删操作一测试：");
        myCircularLinkedList.print();

        //删操作二测试，删除元素“4”
        System.out.println("\n删操作二测试(删除元素4)：");
        myCircularLinkedList.remove(new Integer(4));
        myCircularLinkedList.print();

        //删操作二测试，删除元素“6”
        System.out.println("\n删操作二测试（删除元素6）：");
        myCircularLinkedList.remove(new Integer(6));
        myCircularLinkedList.print();

        //改操作测试，将第二个位置的元素改为整数5
        myCircularLinkedList.set(1,new Integer(5));
        System.out.println("\n改操作测试：");
        myCircularLinkedList.print();

        //查操作测试，取第一个位置的元素
        System.out.println("\n查操作测试：");
        System.out.println(myCircularLinkedList.get(0).toString());

        //合并操作测试，合并两个循环链表
        System.out.println("\n合并操作测试：");
        MyCircularLinkedList anotherList = new MyCircularLinkedList();
        anotherList.add(7);
        anotherList.add(8);
        anotherList.add(9);
        myCircularLinkedList.combine(anotherList);
        myCircularLinkedList.print();
    }
}
