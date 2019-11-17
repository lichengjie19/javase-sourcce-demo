package thinkinginjava.chapter.six;

/**
 * 测试当构造器是私有的时候, 是否可以被继承?
 * 结论:
 *     1) 当一个类只有私有的构造器时, 是不允许被继承的;
 *     2) 当一个类只有有参的构造器时, 即没有默认构造器, 继承者必须拥有相同的有参构造器, 并且第一行代码是 super(parameters)
 * @author licjd
 * @date 2019/11/17 10:43
 */
public class ConstructorDemo extends ConstructorFather{

    public ConstructorDemo(int i) {
        super(i);
    }
}

class ConstructorFather {

    private ConstructorFather() {

    }

    public ConstructorFather(int i) {

    }

}