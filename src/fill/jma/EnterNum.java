package fill.jma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterNum {
    public static int enterNumA() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write number");
        System.out.print("a = ");
        int a = Integer.parseInt(reader.readLine());
        return a;

    }

    public static int enterNumB() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write number");
        System.out.print("b = ");
        int b = Integer.parseInt(reader.readLine());
        return b;
    }
}
