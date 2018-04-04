/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyLinkedStackTest {
    public static void main(String[] args) {
        MyLinkedStack myLinkedStack = new MyLinkedStack();

        //测试进栈操作
        System.out.println("测试进栈操作：");
        myLinkedStack.push(new Integer(1));
        myLinkedStack.print();
        myLinkedStack.push(new Integer(2));
        myLinkedStack.print();
        myLinkedStack.push(new Integer(3));
        myLinkedStack.print();

        //测试getTop
        System.out.println("查看栈顶元素");
        System.out.println("Stack top: "+myLinkedStack.getTop().toString());


        //测试出栈操作
        System.out.println("测试出栈操作：");
        System.out.println("出栈元素："+myLinkedStack.pop().toString());
        myLinkedStack.print();
        System.out.println("出栈元素："+myLinkedStack.pop().toString());
        myLinkedStack.print();

        //测试清空操作
        System.out.println("测试清空操作");
        myLinkedStack.clearStack();
        System.out.println("Stack empty: "+myLinkedStack.isStackEmpty());
    }
}
