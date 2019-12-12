package lang.demo;

import com.sun.javafx.image.IntPixelGetter;

import java.util.*;

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

//        System.out.println("qqqqqqqqqqqqqqqqq");
//        int num = Integer.parseInt("ffffffff", 16);
        System.out.println(Integer.parseInt("100", 16));

        System.out.println(Integer.getInteger("java.vendor"));

        System.out.println(Integer.decode("0xfffffff"));
        System.out.println(0xfffffff);
        System.out.println(011);

        int x = 1;
        x += 3.5; // x = (int)(x +3.5)
        System.out.println(x);

        // 转换为二进制
        String binaryString = Integer.toBinaryString(123);
        System.out.println(binaryString);
        // 转换为十进制
        // 二进制没有 Accepts decimal, hexadecimal, and octal numbers given by the following grammar:
        System.out.println(Integer.decode(binaryString));
        System.out.println(Integer.parseInt(binaryString, 2));
        System.out.println(Integer.valueOf(binaryString, 2));

        // 转换为八进制
        String octalString = Integer.toOctalString(123);
        System.out.println(octalString);
        // 转换为十进制
        System.out.println(Integer.decode("0" + octalString));
        System.out.println(Integer.parseInt(octalString, 8));
        System.out.println(Integer.valueOf(octalString, 8));

        // 转换为十六进制
        String hexString = Integer.toHexString(123);
        System.out.println(hexString);
        // 转换为十进制
        System.out.println(Integer.decode("0x" + hexString));
        System.out.println(Integer.parseInt(hexString, 16));
        System.out.println(Integer.valueOf(hexString, 16));

        // highest one bit
        System.out.println(Integer.highestOneBit(1600));
        System.out.println(Integer.lowestOneBit(1600));
        System.out.println(Integer.numberOfLeadingZeros(1600));
        System.out.println(Integer.numberOfTrailingZeros(1600));


        System.out.println(Integer.reverse(1));
    }


}
