package thinkinginjava.chapter.seven;

/**
 * final方法
 * 如果某方法为private, 则其不是基类的接口的一部分.
 * @author: licj
 * @date: 2019/11/24 10:49
 */
public class FinalOverridingIllusion extends WithFinal{

    public final void f() {
        System.out.println("FinalOverridingIllusion.f()");
    }

    public static void main(String[] args) {
        FinalOverridingIllusion finalOverridingIllusion = new FinalOverridingIllusion();
        finalOverridingIllusion.f();

        WithFinal withFinal = finalOverridingIllusion;
        // 编译正确, 运行提示: Error:(20, 18) java: f() 在 thinkinginjava.chapter.seven.WithFinal 中是 private 访问控制
//        withFinal.f();
    }

}

class WithFinal {
    private final void f() {
        System.out.println("WithFinal.f()");
    }
}
