package fill.jma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoseOperation {
    public static void choseOperation() throws IOException {
        System.out.println("Hello! What are you want do? + - * / ?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String operations = String.valueOf(reader.readLine());

        switch (operations) {
            case ("+"):
                System.out.println("you chose Summ");
                System.out.println("result Summ is " + Summ.summ());
                break;
            case ("-"):
                System.out.println("you chose Subtraction");
                System.out.println("result Subtraction is " + Subtraction.subtraction());
                break;
            case ("*"):
                System.out.println("you chose Multiplication");
                System.out.println("result Multiplication is " + Multiplication.multiplication());
                break;
            case ("/"):
                System.out.println("you chose Division");
                System.out.println("result Division is " + Division.division());
                break;
        }
    }
}
