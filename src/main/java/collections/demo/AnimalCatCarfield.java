package collections.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 《码出高效：Java开发手册》
 * <? extends T> 与 <? super T>的区别及其限制与适用性
 * 作用: 放置多种受泛型约束的类型
 * 区别:
 *       <? extends T>是Ger First,适用于,消费集合元素为主的场景;
 *       <? super T>是Put First，适用于，生产集合元素为主的场景；
 * 解释：
 *       <? extends T>可以赋值给任何T及T子类的集合, 上界为T, 取出来的类型带有泛型限制, 向上强制转型为T. null可以表示任何类型, 所以除null外, 任何元素都不得添加进<? extends T>集合内.
 *       <? super T>可以赋值给任何T及T的父类集合,下界为T. 在生活中, 投票选举类似于<? super T>的操作. 选举代表时, 你只能往里投选票, 取数据事, 根本不知道是谁的票, 相当于泛型丢失.
 *       extends的场景是put功能受限, 而super的场景是get功能受限.
 * 扩展:
 *       针对以下代码, 对于一个笼子, 如果只是不断地向外取动物而不向里放的话, 则属于Get First, 应采用<? extend T>;
 *       相反, 如果经常向里放动物的话, 则采用<? super T>, 属于Put First.
 * @author licjd
 * @date 2019/11/14 19:00
 */
public class AnimalCatCarfield {

    public static void main(String[] args) {

        // 第1段: 声明三个继承的类的集合: Object > 动物 > 猫 > 加菲猫
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Garfield> garfields = new ArrayList<>();

        animals.add(new Animal());
        cats.add(new Cat());
        garfields.add(new Garfield());

        // 第2段: 测试赋值操作
        // 下行编译出错, 只能赋值Cat或Cat子类的集合
//        List<? extends Cat> extendsCatFromAnimal = animals;
        List<? super Cat> superCatFromAnimal = animals;

        List<? extends Cat> extendsCatFromCat = cats;
        List<? super Cat> superCatFromCat = cats;

        List<? extends Cat> extendsCatFromGarfield = garfields;
        // 下行编译出错,只能赋值Cat或Cat父类的集合
//        List<? super Cat> superCatFromGarfield = garfields;

        // 第3段: 测试add方法
        // 下面三行中所有的<? extends T> 都无法进行add操作, 编译均出错
//        extendsCatFromCat.add(new Animal());
//        extendsCatFromCat.add(new Cat());
//        extendsCatFromCat.add(new Garfield());

        // 下行编译出错, 只能添加Cat或Cat子类的集合
//        superCatFromCat.add(new Animal());
        superCatFromCat.add(new Cat());
        superCatFromCat.add(new Garfield());

        // 第4段: 测试get方法
        // 所有的super操作能够返回元素, 但是泛型丢失, 只能返回Object对象

        // 以下extends操作能够返回元素
        Object catExtends2 = extendsCatFromCat.get(0);
        Cat catExtends1 = extendsCatFromCat.get(0);
        // 下行编译出错, 虽然Cat集合从Grafield赋值而来, 但类型擦除后, 是不知道的
//        Garfield garfield1 = extendsCatFromGarfield.get(0);

    }

}

class Animal{}

class Cat extends Animal{}

class Garfield extends Cat{}
