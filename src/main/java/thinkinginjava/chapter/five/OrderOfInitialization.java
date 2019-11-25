package thinkinginjava.chapter.five;

import javafx.beans.WeakInvalidationListener;

/**
 * 在类的内部, 变量定义的先后顺序决定了初始化的顺序.
 * 即使变量定义散布于方法定义之间, 它们仍旧会在任何方法(包括构造器)被调用之前得到初始化
 * @author: licj
 * @date: 2019/11/24 16:08
 */
public class OrderOfInitialization {

    public static void main(String[] args) {
        House house = new House();
        house.f();
    }

}

class Window {
    Window(int mareker) {
        System.out.println("Window(" + mareker + ")");
    }
}

class House {
    // before constructor
    Window w1 = new Window(1);
    House() {
        System.out.println("House()");
        Window w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("House.f()");
    }
    Window w3 = new Window(3);
}