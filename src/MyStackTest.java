/**
 * Created by FireFlies on 2018/4/3.
 */
public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);

        //测试进栈操作
        System.out.println("测试进栈操作：");
        myStack.push(new Integer(1));
        myStack.push(new Integer(2));
        myStack.push(new Integer(3));
        myStack.print();

        //测试getTop
        System.out.println("查看栈顶元素");
        System.out.println("Stack top: "+myStack.getTop().toString());


        //测试出栈操作
        System.out.println("测试出栈操作：");
        System.out.println("出栈元素："+myStack.pop().toString());
        myStack.print();
        System.out.println("出栈元素："+myStack.pop().toString());
        myStack.print();

        //测试清空操作
        System.out.println("测试清空操作");
        myStack.clearStack();
        System.out.println("Stack empty: "+myStack.isStackEmpty());
    }
}
