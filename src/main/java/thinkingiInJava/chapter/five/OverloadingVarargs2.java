package thinkingiInJava.chapter.five;

/**
 * Java SE5 特性: 可变参数
 *   以下方法在使用时, 可能会有引用不明确的Error
 * @author licjd
 * @date 2019/11/16 14:26
 */
public class OverloadingVarargs2 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("first");
    }

    public static void main(String[] args) {
        f(1, 'a');
        // 下行编译出错
        f('a', 'b');
    }
}
