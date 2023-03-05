package fill.jma;

import java.io.IOException;

public class Summ {
    public static int summ() throws IOException {
        int a = EnterNum.enterNumA();
        int b = EnterNum.enterNumB();
        int result = a + b;
        return result;
    }
}
