package thinkinginjava.chapter.ten;

/**
 * 外部类可以访问其内部类的private元素.
 * @author: licj
 * @date: 2019/12/3 23:17
 */
public class ExerciseEight {

    class InnerClass {
        private int num = 5;
        protected String str = "1";
    }

    public static void main(String[] args) {
        ExerciseEight exerciseEight = new ExerciseEight();
        ExerciseEight.InnerClass innerClass = exerciseEight.new InnerClass();
        System.out.println(innerClass.num);
        System.out.println(new ExerciseEight().new InnerClass().str);
    }

}
