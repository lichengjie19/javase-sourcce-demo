package thinkingiInJava.chapter.five;


/**
 * 1. 测试类中有多个类变量(static)时, 不创建该对象, 使用其中一个类变量另一个类变量是否会被初始化
 *    结论: 静态初始化只有在必要时刻才会进行, 第一次创建对象或者第一次访问静态数据.
 * 2. 静态类变量的使用必须有声明.
 * @author licjd
 * @date 2019/11/16 11:52
 */
public class StaticValues {

    public static void main(String[] args) {
        A a3 = TestStatic.a1;
        A a = new A(TestStatic.num);
        System.out.println(TestStatic.a1);

        // 编译出错 Not a statement 类比于
//        TestStatic.a1;
//        9;
    }

}

class A {
    A(int val) {
        System.out.println("A(" + val + ")");
    }
}

class TestStatic {
    static A a1 = new A(1);
    static A a2 = new A(2);
    static int num;
}