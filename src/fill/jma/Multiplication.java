package fill.jma;

import java.io.IOException;

public class Multiplication {
    public static int multiplication() throws IOException {
        int a = EnterNum.enterNumA();
        int b = EnterNum.enterNumB();
        int result = a * b;
        return result;
    }
}
