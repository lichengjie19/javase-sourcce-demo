package thinkinginjava.chapter.twelve;

/**
 * 12.8.3 缺憾: 异常丢失
 * 遗憾的是, Java的异常实现也有瑕疵. 异常作为程序出错的标志, 绝不应该被忽略, 但它
 * 还是有可能被轻易地忽略. 用某些特殊的方式使用finally子句, 就会发生这种情况.
 * @author yd
 * @date 2020/1/1 22:41
 */
public class LostMessage {

    void f() throws VeryImportException {
        throw new VeryImportException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class VeryImportException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception!";
    }
}
