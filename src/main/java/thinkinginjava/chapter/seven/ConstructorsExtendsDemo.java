package thinkinginjava.chapter.seven;

/**
 * P130 练习5: 继承, 父类类成员构造器\成员变量\静态变量 执行先后顺序
 * @author: licj
 * @date: 2019/11/20 23:57
 */
public class ConstructorsExtendsDemo {

    public static void main(String[] args) {
        // new C();
        C c = new C();
    }

}

class A {
    A() {
        System.out.println("A()");
    }
}

class B {
    B(String str) {
        System.out.println(str);
    }
}

class C extends A{
    static B b1 = new B("static B()");
    B b2 = new B("B()");
//    C(){
//        System.out.println("C()");
//    }
}