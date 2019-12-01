package lang.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author licjd
 * @date 2019/11/5 21:28
 */
public class IntegerDemo {

    public static void main(String[] args) {

        // 最大/最小值
        System.out.println(0x80000000);
        System.out.println(0x7fffffff);

        // 属性TYPE
        System.out.println(int.class);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.class);
        System.out.println(int.class == Integer.TYPE);

        int q, r;
        int i = 223;
        q = i / 100;
        // really: r = i - (q * 100);
        System.out.println(q<<6);
        System.out.println(q<<5);
        System.out.println(q<<2);
        r = i - ((q << 6) + (q << 5) + (q << 2));

        // parseInt
        System.out.println(Integer.parseInt("123"));

        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());

    }

    public void a() {
        return;
    }

}
