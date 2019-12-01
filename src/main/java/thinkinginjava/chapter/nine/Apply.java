package thinkinginjava.chapter.nine;

import java.util.Arrays;
import java.util.Random;

/**
 * 知识点:
 * 1. 协变类型:
 *     表示导出类中的被覆盖方法可以返回基类方法的返回类型的某种导出类型.
 * 2. 策略设计模式:
 *     创建一个能够根据所传递的参数对象的不同而具有不同行为的方法, 被称为策略设计模式.
 *     这类方法包含所要执行的算法中固定不变的部分, 而"策略"包含变化的部分.
 *     策略就是传递进去的参数对象, 它包含所要执行代码.
 *    e.g.
 *     Processor对象就是一个策略, 在main()方法中可以看到有三种不同类型的策略应用到了String类型的s对象上.
 * @author licjd
 * @date 2019/12/1 11:00
 */
public class Apply {

    public final int num = new Random(9).nextInt();

    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }

}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    String process(Object input) { // Covariant return
        String s = (String) input;
        return s.toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) { // Covariant return
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) { // Covariant return
        return Arrays.toString(((String)input).split(" "));
    }
}