package collections.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试List->array, 三种情况
 *   array.length < list.size
 *   array.length = list.size
 *   array.length > list.size
 * @author licjd
 * @date 2019/11/13 9:46
 */
public class ListToArrayTest {

    public static void main(String[] args) {
        String[] strArr = new String[3];

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
//        strList.add("c");
//        strList.add("d");
        strList.toArray(strArr);
        System.out.println(strArr.length);
    }

}
