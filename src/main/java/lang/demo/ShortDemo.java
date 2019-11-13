package lang.demo;

/**
 *
 * @author licjd
 * @date 2019/11/4 19:41
 */
public class ShortDemo {

    public static void main(String[] args) {
        // 探索次方
        System.out.println(Math.pow(2, 8));

        // Integer 最大值
        System.out.println(0x7fffffff);
        // Integer 最小值
        System.out.println(0x80000000);

        // radix 进制
        System.out.println(Integer.toString(2147483647, 2));

        // String -> Short
        System.out.println(Short.parseShort("3276", 10));

        // ShortCache cache[] 初始化数组的大小, 便于理解
        // -128 最小值, 127 最大值, 1 代表0
        System.out.println(-(-128) + 127 + 1);

        // 测试decode的作用: 将不同进制的数转换为十进制的Short
        System.out.println(Short.decode("0x12"));
        System.out.println(Short.decode("0X12"));
        System.out.println(Short.decode("#12"));
        System.out.println(Short.decode("012"));
        System.out.println(Short.decode("12"));

        // Short.hashCode() @since 1.8
        System.out.println(new Short("10").hashCode());

        // 比较的方法
        System.out.println(new Short("10").compareTo((short)5));
        System.out.println(Short.compare((short)10, (short)5));
        System.out.println(Short.compare((short)10, (short)15));

        // ?
        System.out.println(0xFF00);
        System.out.println(123 & 0xFF00);
        System.out.println(0 >> 8);
        System.out.println(123 << 8);
        System.out.println(Integer.parseInt("0111101100000000", 2));
        // System.out.println(0 | 123);
        // System.out.println(((123 & 0xFF00) >> 8) | (123 << 8));
        System.out.println(Short.reverseBytes((short)123));

        // 无符号数的处理
        System.out.println(-1 & 0xffff);
        System.out.println(Short.toUnsignedInt((short)-1));
    }

}
