package thinkinginjava.chapter;

/**
 * 测试参数一样，顺序相反的重载
 * @author: licj
 * @date: 2019/11/12 23:08
 */
public class ReloadMethod {

    public static void b(ReloadMethod reloadMethod) {
        reloadMethod.a(1, "b");
    }

    public void a(int i, String s) {
        System.out.println(this);
        System.out.println("int i, String s");
    }

    public void a(String s, int i) {
        System.out.println(this);
        System.out.println("String s, int i");
    }

    public static void main(String[] args) {
        new ReloadMethod().a(1, "s");
        new ReloadMethod().a("s", 1);
    }

}
