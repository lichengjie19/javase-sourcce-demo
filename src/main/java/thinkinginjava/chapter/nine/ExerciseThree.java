package thinkinginjava.chapter.nine;

/**
 * 创建一个基类, 让它包含抽象方法print(), 并在导出类中覆盖该方法. 覆盖后
 * 的方法版本可以打印导出类中定义的某个整形变量的值. 在定义该变量之处, 赋予它非零值.
 * 在基类的构造器中调用这个方法.
 * @author: licj
 * @date: 2019/11/25 23:16
 */
public class ExerciseThree extends B{

    int num = 7;

    @Override
    void print() {
        System.out.println("num = " + num);
    }

    public static void main(String[] args) {
        ExerciseThree exerciseThree = new ExerciseThree();
        exerciseThree.print();
    }
}

abstract class B {

    B() {
//        num = 1;
        print();
    }

    abstract void print();
}