package thinkinginjava.chapter.ten;

/**
 * 10.8.1 闭包与回调
 * 闭包(closure)是一个可调用的对象, 它记录了一些信息, 这些信息来自于创建它的作用域.
 * 内部类是面向对象的闭包, 因为它不仅包含外围类对象(创建内部类的作用域)的信息, 还自动拥有一个指向此外围类对象的引用.
 *
 *
 * @author: licj
 * @date: 2019/12/10 23:13
 */
public class Callbacks {

    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);

        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();

        caller2.go();
        caller2.go();
    }

}

interface Incrementable {
    void increment();
}

// Very simple to just implement the interface:
class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi) {
        mi.increment();
    }
}

// If you class must implement increment() in some other way, you must use an inner class.
class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {

        @Override
        public void increment() {
            // Sepcify outer-class method, otherwise you'd get an infinite recursion:
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }
    void go() {
        callbackReference.increment();
    }
}