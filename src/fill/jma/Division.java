package fill.jma;

import java.io.IOException;

public class Division {
    public static int division() throws IOException {
        int a = EnterNum.enterNumA();
        int b = EnterNum.enterNumB();
        int result = a / b;
        return result;
    }
}
