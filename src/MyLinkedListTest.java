/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        //增操作一测试,添加三个整数元素
        myLinkedList.add(new Integer(1));
        myLinkedList.add(new Integer(2));
        myLinkedList.add(new Integer(3));
        System.out.println("增操作一测试：");
        myLinkedList.print();

        //增操作二测试，在第二个位置增加整数4
        myLinkedList.insert(3,new Integer(4));
        System.out.println("增操作二测试：");
        myLinkedList.print();

        //删操作一测试，删除第三个位置的元素
        myLinkedList.delete(2);
        System.out.println("删操作一测试：");
        myLinkedList.print();

        //删操作二测试，删除元素“4”
        System.out.println("删操作二测试(删除元素4)：");
        myLinkedList.remove(new Integer(4));
        myLinkedList.print();

        //删操作二测试，删除元素“6”
        System.out.println("删操作二测试（删除元素6）：");
        myLinkedList.remove(new Integer(6));
        myLinkedList.print();

        //改操作测试，将第二个位置的元素改为整数5
        myLinkedList.set(1,new Integer(5));
        System.out.println("改操作测试：");
        myLinkedList.print();

        //查操作测试，取第一个位置的元素
        System.out.println("查操作测试：");
        System.out.println(myLinkedList.get(0).toString());
    }
}
