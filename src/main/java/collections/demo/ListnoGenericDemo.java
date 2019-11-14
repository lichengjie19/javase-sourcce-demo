package collections.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 * List<Object>
 * List<?>
 * @author licjd
 * @date 2019/11/14 9:35
 */
public class ListnoGenericDemo {

    public static void main(String[] args) {
        // 泛型出现之前的集合定义方式
        List a1 = new ArrayList();
        a1.add(new Object());
        a1.add(new Integer(111));
        a1.add(new String("a1"));
        System.out.println(a1.size());

        // 把a1引用赋值给a2, 注意a2 与 al 的区别是增加了泛引限制<Object>
        List<Object> a2 = a1;
        a2.add(new Object());
        a2.add(new Integer(222));
        a2.add(new String("a3"));
        System.out.println(a2.size());


    }

}
