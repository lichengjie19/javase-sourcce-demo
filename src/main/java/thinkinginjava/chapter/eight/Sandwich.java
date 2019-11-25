package thinkinginjava.chapter.eight;

/**
 * 组合、继承、多态的构建顺序
 * @author: licj
 * @date: 2019/11/24 16:15
 */
public class Sandwich extends PortableLunch{



    public static void main(String[] args) {
        new Sandwich();
    }

}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce");
    }
}

class Lunch extends Meal{
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    private Bread bread = new Bread();
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}
