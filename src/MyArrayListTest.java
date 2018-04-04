import java.util.ArrayList;
import java.util.List;

/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(3);

        //增操作一测试,添加三个整数元素
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println("增操作一测试：");
        myArrayList.print();

        //增操作二测试，在第二个位置增加整数4
        myArrayList.insert(1,4);
        System.out.println("增操作二测试：");
        myArrayList.print();
        System.out.println("目前的容量："+myArrayList.capacity); //顺便测试动态容量

        //删操作一测试，删除第三个位置的元素
        myArrayList.delete(2);
        System.out.println("删操作一测试：");
        myArrayList.print();

        //删操作二测试，删除元素“4”
        myArrayList.remove(4);
        System.out.println("删操作二测试：");
        myArrayList.print();

        //删操作二测试，删除元素“6”
        myArrayList.remove(6);
        System.out.println("删操作二测试：");
        myArrayList.print();

        //改操作测试，将第二个位置的元素改为整数5
        myArrayList.set(1,5);
        System.out.println("改操作测试：");
        myArrayList.print();

        //查操作测试，取第一个位置的元素
        System.out.println("查操作测试：");
        System.out.println(myArrayList.get(0).toString());

    }
}
