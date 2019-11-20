package thinkinginjava.chapter;

/**
 * 测试基本类型重载调用
 * @author: licj
 * @date: 2019/11/11 23:12
 */
public class IntFloatDemo {

    public void f(float n) {
        System.out.println("Float");
    }

    public void f(double n) {
        System.out.println("Double");
    }

    public static void main(String[] args) {
        new IntFloatDemo().f(10);
    }

}
