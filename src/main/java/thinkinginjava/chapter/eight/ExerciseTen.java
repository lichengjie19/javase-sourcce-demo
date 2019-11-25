package thinkinginjava.chapter.eight;

/**
 * 一个包含两个方法的基类, 在第一个方法中中可以调用第二个方法.
 * 然后产生一个继承自该基类的导出类, 且覆盖基类中的第二个方法.
 * 为导出类创建一个对象, 将它向上转型到基类并调用第一个方法.
 * @author: licj
 * @date: 2019/11/24 15:19
 */
public class ExerciseTen {

    public static void main(String[] args) {
        B b = new B();
        A a = b;
        a.a();
    }

}

class A {
    public void a() {
        System.out.println("A.a()");
        b();
    }

    public void b() {
        System.out.println("A.b()");
    }
}

class B extends A {
    public void b() {
        System.out.println("B.b()");
    }
}
