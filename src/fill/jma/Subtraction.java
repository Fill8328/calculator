package fill.jma;

import java.io.IOException;

public class Subtraction {
    public static int subtraction() throws IOException{
        int a = EnterNum.enterNumA();
        int b = EnterNum.enterNumB();
        int result = a - b;
        return result;
    }
}
