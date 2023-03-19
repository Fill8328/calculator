package fill.jma;

import java.io.IOException;

public class Division {
    public static int division() throws IOException {
        int a = EnterNum.enterNumA();
        int b = EnterNum.enterNumB();
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Infinity");
        }
        return result;
    }
}
